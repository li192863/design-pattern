package com.pattern.creational_patterns.abstract_factory;

/**
 * 测试类
 *
 * @author: Chestnut
 * @since: 2023-06-30
 **/
public class Main {
    public static void main(String[] args) {
        CarFactory factory = new LuxuryCarFactory();
        Engine e = factory.createEngine();

        // 转得快！
        e.run();
        // 启动快！
        e.start();
    }
}

/*
转得快！
启动快！
 */
