package com.example.springboot.cglib;

import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

public class CglibProxyIntercepter implements MethodInterceptor {

    //o：cglib生成的代理对象，
    // method：被代理对象方法，
    // objects：方法入参，
    // methodProxy:代理方法
    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        System.out.println("执行前...");
        Object object = methodProxy.invokeSuper(o, objects);
        System.out.println("执行后...");
        return null;
    }
}
