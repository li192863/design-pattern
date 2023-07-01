package com.pattern.behavioral_patterns.strategy;

/**
 * 测试类
 *
 * @author: Chestnut
 * @since: 2023-07-01
 **/
public class Main {
    public static void main(String[] args) {
        Strategy s1 = new OldCustomerManyStrategy();
        Context context = new Context(s1);
        context.printPrice(100.0);
    }
}

/*
六九折
您的报价为69.0
 */
