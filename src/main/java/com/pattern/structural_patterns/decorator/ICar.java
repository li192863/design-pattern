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
 * 抽象组件
 */
public interface ICar {
    void move();
}

/**
 * 具体组件
 */
class Car implements ICar {
    @Override
    public void move() {
        System.out.println("陆地上跑...");
    }
}
