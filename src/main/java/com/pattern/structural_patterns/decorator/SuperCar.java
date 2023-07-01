package com.pattern.structural_patterns.decorator;

/**
 * 装饰器（Decorator）
 * *动态地给一个对象添加一些额外的职责。就增加功能来说，相比生成子类更为灵活。*
 * * 特点
 *   * 使用装饰模式，可以独立增加核心功能，也可以独立增加附加功能，二者互不影响；
 *   * 可以在运行期动态地给核心功能增加任意个附加功能。
 * @author: Chestnut
 * @since: 2023-06-30
 **/

/**
 * 装饰角色
 */
public class SuperCar implements ICar {
    protected ICar car;

    public SuperCar(ICar car) {
        this.car = car;
    }

    @Override
    public void move() {
        car.move();
    }
}

/**
 * 具体装饰角色-飞车
 */
class FlyCar extends SuperCar {
    public FlyCar(ICar car) {
        super(car);
    }

    public void fly() {
        System.out.println("天空中飞...");
    }

    @Override
    public void move() {
        super.move();
        fly();
    }
}

/**
 * 具体装饰角色-水车
 */
class WaterCar extends SuperCar {
    public WaterCar(ICar car) {
        super(car);
    }

    public void swim() {
        System.out.println("水面上游...");
    }

    @Override
    public void move() {
        super.move();
        swim();
    }
}

/**
 * 具体装饰角色-智能车
 */
class AICar extends SuperCar {
    public AICar(ICar car) {
        super(car);
    }

    public void AutoMove() {
        System.out.println("自动驾驶...");
    }

    @Override
    public void move() {
        super.move();
        AutoMove();
    }
}
