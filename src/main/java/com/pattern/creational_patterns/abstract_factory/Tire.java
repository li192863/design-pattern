package com.pattern.creational_patterns.abstract_factory;

/**
 * 抽象工厂（Abstract Factory）
 * *提供一个创建一系列相关或相互依赖对象的接口，而无需指定它们具体的类。*
 * * 特点
 *   * 抽象工厂模式是为了让创建工厂和一组产品与使用相分离，并可以随时切换到另一个工厂以及另一组产品；
 *   * 抽象工厂模式实现的关键点是定义工厂接口和产品接口，但如何实现工厂与产品本身需要留给具体的子类实现，客户端只和抽象工厂与抽象产品打交道。
 * @author: Chestnut
 * @since: 2023-06-30
 **/

/**
 * 产品接口-轮胎
 */
public interface Tire {
    void revolve();
}

/**
 * 产品实现类-好轮胎
 */
class LuxuryTire implements Tire {
    @Override
    public void revolve() {
        System.out.println("旋转不磨损！");
    }
}

/**
 * 产品实现类-烂轮胎
 */
class LowTire implements Tire {
    @Override
    public void revolve() {
        System.out.println("旋转磨损大！");
    }
}
