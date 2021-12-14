package com.iversonx.ibatis.mapper_proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 *
 **/
public class DynamicProxy implements InvocationHandler {
    
    private Object target;
    
    public Object newProxy(Object target) {
        this.target = target;
        ClassLoader classLoader = target.getClass().getClassLoader();
        Class<?>[] interfaces = target.getClass().getInterfaces();
        return Proxy.newProxyInstance(classLoader, interfaces, this);
    }
    
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("======= before proxy ========");
        Object result= method.invoke(target, args);
        System.out.println("======= after proxy ========");
        return result;
    }
}
