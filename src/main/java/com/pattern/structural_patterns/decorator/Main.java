package com.pattern.structural_patterns.decorator;

/**
 * 测试类
 *
 * @author: Chestnut
 * @since: 2023-06-30
 **/
public class Main {
    public static void main(String[] args) {
        Car car = new Car();
        car.move();

        System.out.println("-----增加飞行功能-----");
        FlyCar flyCar = new FlyCar(car);
        flyCar.move();

        System.out.println("-----增加游泳功能-----");
        WaterCar waterCar = new WaterCar(flyCar);
        waterCar.move();

        System.out.println("-----增加飞行功能-----");
        AICar aiCar = new AICar(waterCar);
        aiCar.move();
    }
}

/*
陆地上跑...
-----增加飞行功能-----
陆地上跑...
天空中飞...
-----增加游泳功能-----
陆地上跑...
天空中飞...
水面上游...
-----增加飞行功能-----
陆地上跑...
天空中飞...
水面上游...
自动驾驶...
 */
