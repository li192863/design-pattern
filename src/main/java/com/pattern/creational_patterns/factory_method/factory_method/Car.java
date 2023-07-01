package com.pattern.creational_patterns.factory_method.factory_method;

/**
 * 工厂方法（Factory Method）
 * *定义一个用于创建对象的接口，让子类决定实例化哪一个类。工厂方法使一个类的实例化延迟到其子类。*
 * * 特点
 *   * 工厂方法是指定义工厂接口和产品接口，但如何创建实际工厂和实际产品被推迟到子类实现，从而使调用方只和抽象工厂与抽象产品打交道；
 *   * 实际更常用的是更简单的静态工厂方法，它允许工厂内部对创建产品进行优化；
 *   * 调用方尽量持有接口或抽象类，避免持有具体类型的子类，以便工厂方法能随时切换不同的子类返回，却不影响调用方代码。
 * @author: Chestnut
 * @since: 2023-06-30
 **/

/**
 * 产品接口-汽车
 */
public interface Car {
    void run();
}

/**
 * 产品实现类-特斯拉
 */
class Tesla implements Car {
    @Override
    public void run() {
        System.out.println("Tesla在跑...");
    }
}

/**
 * 产品实现类-比亚迪
 */
class Byd implements Car {
    @Override
    public void run() {
        System.out.println("比亚迪在跑...");
    }
}
