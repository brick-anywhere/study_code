package com.dll.design.demo.singleton;

/**
 * @author dll
 * @date 2021-03-23 16:02
 */
public class MultiThread implements Runnable{
    public MultiThread() {

    }

    private String name;

    public MultiThread(String name) {

        this.name = name;

    }

    public void run() {

        for (int i = 0; i < 100; i++) {

            System.out.println(name + "运行     " + i);

        }

    }

}
