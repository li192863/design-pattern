package com.pattern.structural_patterns.adapter;

/**
 * 测试类
 *
 * @author: Chestnut
 * @since: 2023-06-30
 **/
public class Main {
    public static void main(String[] args) {
        // 客户端, 可以执行test方法
        Client c = new Client();
        // 被适配对象, 可以执行request方法
        Adaptee a = new Adaptee();
        // 适配器, 调用被适配对象方法
        Target t = new Adapter(a);

        c.test(t);
    }
}

/*
可以完成客户请求的功能！
 */
