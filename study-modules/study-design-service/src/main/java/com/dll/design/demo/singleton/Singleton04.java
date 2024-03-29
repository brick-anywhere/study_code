package com.dll.design.demo.singleton;

/**
 * 双检锁/双重校验锁（DCL，即 double-checked locking）
 * JDK 版本：JDK1.5 起
 * 是否 Lazy 初始化：是
 * 是否多线程安全：是
 * 实现难度：较复杂
 * 注！！！！
 * 描述：这种方式采用双锁机制，安全且在多线程情况下能保持高性能。
 * getInstance() 的性能对应用程序很关键
 *
 * @author dll
 * @date 2021-03-25 15:04
 */
public class Singleton04 {
    private volatile static Singleton04 singleton;

    private Singleton04() {
    }

    public static Singleton04 getSingleton() {
        if (singleton == null) {
            synchronized (Singleton04.class) {
                if (singleton == null) {
                    singleton = new Singleton04();
                }
            }
        }
        return singleton;
    }
}
