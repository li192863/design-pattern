package com.pattern.behavioral_patterns.template_method;

/**
 * 测试类
 *
 * @author: Chestnut
 * @since: 2023-07-01
 **/
public class Main {
    public static void main(String[] args) {
        BankTemplateMethod btm1 = new DrawMoney();
        btm1.process();
        BankTemplateMethod btm2 = new OpenAccount();
        btm2.process();
    }
}

/*
取号排队...
我要取钱!!!
反馈评分...
取号排队...
我要开户!!!
反馈评分...
 */
