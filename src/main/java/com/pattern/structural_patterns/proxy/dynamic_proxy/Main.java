package com.pattern.structural_patterns.proxy.dynamic_proxy;

import java.lang.reflect.Proxy;

/**
 * 测试类
 *
 * @author: Chestnut
 * @since: 2023-06-30
 **/
public class Main {
    public static void main(String[] args) {
        Star real = new RealStar();
        StarHandler handler = new StarHandler(real);

        Star proxy = (Star) Proxy.newProxyInstance(ClassLoader.getSystemClassLoader(), new Class[] {Star.class}, handler);
        proxy.sing();
    }
}

/*
真正方法执行前...
面谈, 签合同, 预付款, 顶机票...
RealStar.sing...
真正方法执行后...
收尾款...
 */
