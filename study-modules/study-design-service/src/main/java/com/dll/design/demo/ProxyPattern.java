package com.dll.design.demo;

import com.dll.design.service.WaiterService;
import com.dll.design.service.impl.ManWaiterServiceImpl;
import org.junit.jupiter.api.Test;
import org.springframework.cglib.proxy.InvocationHandler;
import org.springframework.cglib.proxy.Proxy;

/**
 * 动态代理
 * 代理模式  进行增强
 *
 * 增强： 一个类的功能进行丰富与增强，
 *动态代理：
 *  1.基于JDK的动态代理   (本demo 使用的为  jdk  代理)
 *  2.基于CGILB的动态代理
 * @author dll
 * @date 2021-03-22 10:48
 */
public class ProxyPattern {
    @Test
    public void fun1() {
        WaiterService manWaiter = new ManWaiterServiceImpl();//目标对象
        /*
         * 给出三个参数，来创建方法，得到代理对象
         */
        ClassLoader loader = this.getClass().getClassLoader();//  代理类的加载器
        Class[] interfaces = {WaiterService.class};// 被代理类接口
        InvocationHandler h = new WaiterInvocationHandler(manWaiter);//参数manWaiter表示目标对象
        // 得到代理对象，代理对象就是在目标对象的基础上进行了增强的对象！
        //loader    -->> 代理类的 加载器
        //interfaces-->>被代理类的接口 如果是多个以数组形式传入
        //h         -->>代理类实例
        WaiterService waiterProxy = (WaiterService) Proxy.newProxyInstance(loader, interfaces, h);
        waiterProxy.serve();//前面添加“您好”，　后面添加“再见”
    }


}
