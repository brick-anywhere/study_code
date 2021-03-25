package com.dll.design.demo;

import com.dll.design.demo.singleton.Singleton01;
import com.dll.design.entity.SingleObject;
import org.junit.jupiter.api.Test;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author dll
 * @date 2021-03-23 15:36
 */
public class SingletonPattern {

    /**
     * 最简单 最方便的 单例
     */
    @Test
    public void SingleObject() {
        //编译时错误：构造函数 SingleObject() 是不可见的
        //SingleObject object = new SingleObject();
        for (int i = 0; i < 20; i++) {
            //获取唯一可用的对象
            SingleObject object = SingleObject.getInstance();
            System.out.println("object = " + object.hashCode());
        }
    }


    /**
     * 验证懒汉式 非线程安全
     */
    @org.junit.Test
    public void Singleton01() {
        ExecutorService service = Executors.newCachedThreadPool();
        final CountDownLatch cdOrder = new CountDownLatch(1);
        final CountDownLatch cdAnswer = new CountDownLatch(10000);
        for (int i = 0; i < 10000; i++) {
            Runnable runnable = new Runnable() {
                public void run() {
                    try {
//                       System.out.println("选手" + Thread.currentThread().getName() + "正等待裁判发布口令");
                        cdOrder.await();
//                       System.out.println("选手" + Thread.currentThread().getName() + "已接受裁判口令");
//							Thread.sleep((long) (Math.random() * 10000));
//                       System.out.println("选手" + Thread.currentThread().getName() + "到达终点");
                        String str = String.valueOf(Thread.currentThread().getName());
                        System.out.println("hashCode = " + Singleton01.getInstance().hashCode());
                        cdAnswer.countDown();
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            };
            service.execute(runnable);
        }
        try {
//				Thread.sleep((long) (Math.random() * 10000));

            System.out.println("裁判" + Thread.currentThread().getName() + "即将发布口令");
            cdOrder.countDown();
            System.out.println("裁判" + Thread.currentThread().getName() + "已发送口令，正在等待所有选手到达终点");
            cdAnswer.await();
            System.out.println("所有选手都到达终点");
            System.out.println("裁判" + Thread.currentThread().getName() + "汇总成绩排名");
        } catch (Exception e) {
            e.printStackTrace();
        }
        service.shutdown();


    }
}
