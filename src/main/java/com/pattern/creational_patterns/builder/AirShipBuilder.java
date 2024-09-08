package com.pattern.creational_patterns.builder;

/**
 * 生成器（Builder）
 * *将一个复杂对象的构建与它的表示分离，使得同样的构建过程可以创建不同的表示。*
 * * 特点
 *   * 生成器模式是为了创建一个复杂的对象，需要多个步骤完成创建，或者需要多个零件组装的场景，且创建过程中可以灵活调用不同的步骤或组件；
 *   * 分离了对象子组件的单独构建（由`Builder`负责）和表示（由`Director`负责）。
 * @author: Chestnut
 * @since: 2023-06-30
 **/

/**
 * 构建接口-构建宇宙飞船
 */
public interface AirShipBuilder {
    OrbitalModule buildOrbitalModule();

    Engine buildEngine();

    EscapeTower buildEscapeTower();
}

/**
 * 构建实现类-构建我的宇宙飞船
 */
class MyAirShipBuilder implements AirShipBuilder {
    @Override
    public OrbitalModule buildOrbitalModule() {
        System.out.println("构建我的轨道舱！");
        return new OrbitalModule("我的轨道舱");
    }

    @Override
    public Engine buildEngine() {
        System.out.println("构建我的发动机！");
        return new Engine("我的发动机");
    }

    @Override
    public EscapeTower buildEscapeTower() {
        System.out.println("构建我的逃逸塔！");
        return new EscapeTower("我的逃逸塔");
    }
}
