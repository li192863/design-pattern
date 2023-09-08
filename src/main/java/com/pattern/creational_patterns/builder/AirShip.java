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
 * 复杂对象-宇宙飞船
 */
public class AirShip {
    /**
     * 轨道舱
     */
    private OrbitalModule orbitalModule;
    /**
     * 发动机
     */
    private Engine engine;
    /**
     * 逃逸塔
     */
    private EscapeTower escapeTower;

    /**
     * 发射火箭
     */
    public void launch() {
        System.out.println("发射！");
    }

    public OrbitalModule getOrbitalModule() {
        return orbitalModule;
    }

    public void setOrbitalModule(OrbitalModule orbitalModule) {
        this.orbitalModule = orbitalModule;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public EscapeTower getEscapeTower() {
        return escapeTower;
    }

    public void setEscapeTower(EscapeTower escapeTower) {
        this.escapeTower = escapeTower;
    }

    @Override
    public String toString() {
        return "AirShip{" +
                "orbitalModule=" + orbitalModule +
                ", engine=" + engine +
                ", escapeTower=" + escapeTower +
                '}';
    }
}

/**
 * 轨道舱
 */
class OrbitalModule {
    private String name;

    public OrbitalModule(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "OrbitalModule{" +
                "name='" + name + '\'' +
                '}';
    }
}

/**
 * 发动机
 */
class Engine {
    private String name;

    public Engine(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Engine{" +
                "name='" + name + '\'' +
                '}';
    }
}

/**
 * 逃逸塔
 */
class EscapeTower {
    private String name;

    public EscapeTower(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "EscapeTower{" +
                "name='" + name + '\'' +
                '}';
    }
}
