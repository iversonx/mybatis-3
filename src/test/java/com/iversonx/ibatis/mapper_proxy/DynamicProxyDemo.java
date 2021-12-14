package com.iversonx.ibatis.mapper_proxy;

import com.iversonx.ibatis.mapper_proxy.impl.UserMapperImpl;

/**
 *
 **/
public class DynamicProxyDemo {
    
    public static void main(String[] args) {
        DynamicProxy dynamicProxy = new DynamicProxy();
        UserMapper mapperProxy = (UserMapper)dynamicProxy.newProxy(new UserMapperImpl());
        mapperProxy.show();
    }
}
