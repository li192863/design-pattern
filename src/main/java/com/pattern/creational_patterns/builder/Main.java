package com.pattern.creational_patterns.builder;

/**
 * 测试类
 *
 * @author: Chestnut
 * @since: 2023-06-30
 **/
public class Main {
    public static void main(String[] args) {
        AirShipBuilder builder = new MyAirShipBuilder();
        AirShipDirector director = new MyAirShipDirector(builder);

        AirShip ship = director.directAirShip();
        System.out.println(ship);
        ship.launch();
    }
}

/*
构建我的轨道舱！
构建我的发动机！
构建我的逃逸塔！
AirShip{orbitalModule=OrbitalModule{name='我的轨道舱'}, engine=Engine{name='我的发动机'}, escapeTower=EscapeTower{name='我的逃逸塔'}}
发射！
 */
