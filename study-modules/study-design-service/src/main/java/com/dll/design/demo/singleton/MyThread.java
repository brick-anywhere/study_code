package com.dll.design.demo.singleton;

/**
 * @author dll
 * @date 2021-03-23 17:17
 */
public class MyThread extends Thread {
    public int x = 0;

    public void run(){
        System.out.println(++x);

    }
}
