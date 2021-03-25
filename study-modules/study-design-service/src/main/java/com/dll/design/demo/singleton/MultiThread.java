package com.dll.design.demo.singleton;

import com.dll.design.entity.SingleObject;

/**
 * @author dll
 * @date 2021-03-23 16:02
 */
public class MultiThread implements Runnable {
    public MultiThread() {

    }


    public void run() {

//        System.out.println("当前线程名称=" + Thread.currentThread().getName() + "     " + "hashcode" + SingleObject.getInstance().hashCode());
        System.out.println("当前线程名称=" + Thread.currentThread() + "     " + "hashcode" + Singleton01.getInstance().hashCode());

    }

}
