package com.dll.design.demo.singleton;

/**
 * 懒汉式 非线程安全
 * 是否 Lazy 初始化：是
 * 是否多线程安全：否
 * 实现难度：易
 * <p>
 * 描述：这种方式是最基本的实现方式，这种实现最大的问题就是不支持多线程。因为没有加锁 synchronized，所以严格意义上它并不算单例模式。
 * 这种方式 lazy loading 很明显，不要求线程安全，在多线程不能正常工作。
 * 注！！！！
 * 线程 1 运行到 （1）处的时候，线程 2 抢到的 CPU 的执行权，进入 getInstance() 方法，运行了 instance = new Singleton();，
 * 但线程 2 创建了对象这件事情，线程 1 根本不知道，等到线程 1 重新获得 CPU 执行权的时候，从 （1） 处继续执行，又运行了 instance = new Singleton();
 * 这行代码，这样，“多余的”对象就被创建出来了。
 *
 * @author dll
 * @date 2021-03-23 15:43
 */
public class Singleton01 {
    private static Singleton01 instance;

    private Singleton01() {
    }

    public static Singleton01 getInstance() {
        if (instance == null) {
            instance = new Singleton01();
        }
        return instance;
    }
}
