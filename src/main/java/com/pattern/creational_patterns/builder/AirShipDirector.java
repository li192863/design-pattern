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
 * 表示接口-组装宇宙飞船
 */
public interface AirShipDirector {
    /**
     * 组装飞船对象
     * @return
     */
    AirShip directAirShip();
}

/**
 * 表示实现类-组装我的宇宙飞船
 */
class MyAirShipDirector implements AirShipDirector {
    private AirShipBuilder builder;

    public MyAirShipDirector(AirShipBuilder builder) {
        this.builder = builder;
    }

    @Override
    public AirShip directAirShip() {
        // 构建
        OrbitalModule om = builder.buildOrbitalModule();
        Engine e = builder.buildEngine();
        EscapeTower et = builder.buildEscapeTower();

        // 组装
        AirShip ship = new AirShip();
        ship.setOrbitalModule(om);
        ship.setEngine(e);
        ship.setEscapeTower(et);
        return ship;
    }
}
