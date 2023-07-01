package com.pattern.structural_patterns.proxy.dynamic_proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * 代理（Proxy）
 * *为其他对象提供一种代理以控制对这个对象的访问。*
 * * 特点
 *   * 代理模式通过封装一个已有接口，并向调用方返回相同的接口类型，能让调用方在不改变任何代码的前提下增强某些功能（例如，鉴权、延迟加载、连接池复用等）；
 *   * 使用代理模式要求调用方持有接口，作为代理的类也必须实现相同的接口类型。
 * @author: Chestnut
 * @since: 2023-06-30
 **/

/**
 * 明星处理类（实现`java.lang.reflect.InvocationHandler`接口）
 * 动态代理模式
 */
public class StarHandler implements InvocationHandler {
    private Star realStar;

    public StarHandler(Star realStar) {
        this.realStar = realStar;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        Object object = null;
        System.out.println("真正方法执行前...");
        System.out.println("面谈, 签合同, 预付款, 顶机票...");
        if ("sing".equals(method.getName())) {
            method.invoke(realStar, args);
        }
        System.out.println("真正方法执行后...");
        System.out.println("收尾款...");

        return object;
    }
}
