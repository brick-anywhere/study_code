package com.dll.design.demo;

import com.dll.design.service.WaiterService;
import org.springframework.cglib.proxy.InvocationHandler;

import java.lang.reflect.Method;

/**
 *WaiterService 代理类
 *
 * 服务员 调用控制器
 * @author dll
 * @date 2021-03-22 10:56
 */
public class WaiterInvocationHandler implements InvocationHandler {
    private WaiterService waiter;//目标对象

    public WaiterInvocationHandler(WaiterService waiter) {
        this.waiter = waiter;
    }

    public Object invoke(Object proxy, Method method, Object[] args)
            throws Throwable {
        System.out.println("您好！");
        this.waiter.serve();//调用目标对象的目标方法
        System.out.println("再见！");

        System.out.println("--------------begin-------------");
        Object invoke = method.invoke(waiter, args);//利用反射调用类里面的方法
        System.out.println("--------------end-------------");
        return invoke;

    }


}
