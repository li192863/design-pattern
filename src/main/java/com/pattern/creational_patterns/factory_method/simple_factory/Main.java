package com.pattern.creational_patterns.factory_method.simple_factory;

/**
 * 测试类
 *
 * @author: Chestnut
 * @since: 2023-06-30
 **/
public class Main {
    public static void main(String[] args) {
        Car c1 = CarFactory.createCar("Tesla");
        Car c2 = CarFactory.createCar("Byd");

        // Tesla在跑...
        c1.run();
        // 比亚迪在跑...
        c2.run();
    }
}

/*
Tesla在跑...
比亚迪在跑...
 */
