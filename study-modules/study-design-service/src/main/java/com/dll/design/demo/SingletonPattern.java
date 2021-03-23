package com.dll.design.demo;

import com.dll.design.demo.singleton.MultiThread;
import com.dll.design.demo.singleton.Singleton01;
import com.dll.design.entity.SingleObject;
import org.junit.jupiter.api.Test;

/**
 * @author dll
 * @date 2021-03-23 15:36
 */
public class SingletonPattern {

    @Test
    public void fun() {
        //不合法的构造函数
        //编译时错误：构造函数 SingleObject() 是不可见的
        //SingleObject object = new SingleObject();
        // 最简单 最方便的 单例
        for (int i = 0; i < 20; i++) {
            //获取唯一可用的对象
            SingleObject object = SingleObject.getInstance();
            System.out.println("object = " + object.hashCode());
        }
    }

    @Test
    public void fun01() {
        for (int i = 0; i < 10; i++) {

        }
//        System.out.println("*********************************");
//        for (int i = 0; i < 2000; i++) {
//            //获取唯一可用的对象
//            Singleton01 object = Singleton01.getInstance();
//            System.out.println("object = " + object.hashCode());
//        }
    }


}
