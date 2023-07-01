package com.pattern.structural_patterns.bridge;

/**
 * 测试类
 *
 * @author: Chestnut
 * @since: 2023-06-30
 **/
public class Main {
    public static void main(String[] args) {
        // 销售联想笔记本
        Computer c1 = new Laptop(new Lenovo());
        c1.sale();

        // 销售戴尔台式机
        Computer c2 = new Desktop(new Dell());
        c2.sale();

        // 销售苹果平板电脑
        Computer c3 = new Pad(new Apple());
        c3.sale();
    }
}

/*
销售联想产品！
销售笔记本...
销售戴尔产品！
销售台式机...
销售苹果产品！
销售平板电脑...
 */
