package com.pattern.creational_patterns.factory_method.factory_method;

/**
 * 测试类
 *
 * @author: Chestnut
 * @since: 2023-06-30
 **/
public class Main {
    public static void main(String[] args) {
        Car c1 = new TeslaFactory().createCar();
        Car c2 = new BydFactory().createCar();

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
