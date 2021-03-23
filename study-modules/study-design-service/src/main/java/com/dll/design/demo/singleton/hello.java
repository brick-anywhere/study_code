package com.dll.design.demo.singleton;

/**
 * @author dll
 * @date 2021-03-23 15:59
 */
public class hello implements Runnable {
    public hello() {

    }

    public hello(String name) {
        this.name = name;
    }

    public void run() {

        for (int i = 0; i < 5; i++) {

            System.out.println(name + "运行     " + i);

        }

    }

    public static void main(String[] args) {

        hello h1 = new hello("线程A");

        Thread demo = new Thread(h1);

        hello h2 = new hello("线程B");

        Thread demo1 = new Thread(h2);

        demo.start();

        demo1.start();

    }

    private String name;

}

