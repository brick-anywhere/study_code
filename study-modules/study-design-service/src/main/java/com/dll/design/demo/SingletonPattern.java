package com.dll.design.demo;

import com.dll.design.demo.singleton.*;
import com.dll.design.entity.SingleObject;
import org.junit.jupiter.api.Test;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * 一般情况下，不建议使用第 1 (SingleObject)种和第 2(Singleton02) 种懒汉方式，建议使用第 3(Singleton03) 种饿汉方式。
 * 只有在要明确实现 lazy loading 效果时，才会使用第 5 (Singleton05)种登记方式。
 * 如果涉及到反序列化创建对象时，可以尝试使用第 6 (Singleton06)种枚举方式。
 * 如果有其他特殊的需求，可以考虑使用第 4 (Singleton04)种双检锁方式。
 *
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
    @Test
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


    /**
     * 验证懒汉式 线程安全
     */
    @Test
    public void Singleton02() {
        ExecutorService service = Executors.newCachedThreadPool();
        final CountDownLatch cdOrder = new CountDownLatch(1);
        final CountDownLatch cdAnswer = new CountDownLatch(10000);
        for (int i = 0; i < 10000; i++) {
            Runnable runnable = new Runnable() {
                public void run() {
                    try {
                        cdOrder.await();
//							Thread.sleep((long) (Math.random() * 10000));
                        String str = String.valueOf(Thread.currentThread().getName());
                        System.out.println("hashCode = " + Singleton02.getInstance().hashCode());
                        cdAnswer.countDown();
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            };
            service.execute(runnable);
        }
        try {
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

    /**
     * 验证饿汉式 线程安全
     */
    @Test
    public void Singleton03() {
        ExecutorService service = Executors.newCachedThreadPool();
        final CountDownLatch cdOrder = new CountDownLatch(1);
        final CountDownLatch cdAnswer = new CountDownLatch(10000);
        for (int i = 0; i < 10000; i++) {
            Runnable runnable = new Runnable() {
                public void run() {
                    try {
                        cdOrder.await();
//							Thread.sleep((long) (Math.random() * 10000));
                        String str = String.valueOf(Thread.currentThread().getName());
                        System.out.println("hashCode = " + Singleton03.getInstance().hashCode());
                        cdAnswer.countDown();
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            };
            service.execute(runnable);
        }
        try {
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


    /**
     * 验证DCL 双重校验式的 单例
     */
    @Test
    public void Singleton04() {
        ExecutorService service = Executors.newCachedThreadPool();
        final CountDownLatch cdOrder = new CountDownLatch(1);
        final CountDownLatch cdAnswer = new CountDownLatch(10000);
        for (int i = 0; i < 10000; i++) {
            Runnable runnable = new Runnable() {
                public void run() {
                    try {
                        cdOrder.await();
//							Thread.sleep((long) (Math.random() * 10000));
                        String str = String.valueOf(Thread.currentThread().getName());
                        System.out.println("hashCode = " + Singleton04.getSingleton().hashCode());
                        cdAnswer.countDown();
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            };
            service.execute(runnable);
        }
        try {
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

    /**
     * 登记式/静态内部类
     */
    @Test
    public void Singleton05() {
        ExecutorService service = Executors.newCachedThreadPool();
        final CountDownLatch cdOrder = new CountDownLatch(1);
        final CountDownLatch cdAnswer = new CountDownLatch(10000);
        for (int i = 0; i < 10000; i++) {
            Runnable runnable = new Runnable() {
                public void run() {
                    try {
                        cdOrder.await();
//							Thread.sleep((long) (Math.random() * 10000));
                        String str = String.valueOf(Thread.currentThread().getName());
                        System.out.println("hashCode = " + Singleton05.getInstance().hashCode());
                        cdAnswer.countDown();
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            };
            service.execute(runnable);
        }
        try {
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
