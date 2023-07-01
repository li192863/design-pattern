package com.pattern.structural_patterns.bridge;

/**
 * 桥接（Bridge）
 * *将抽象部分与它的实现部分分离，使它们都可以独立地变化。*
 * * 特点
 *   * 桥接模式通过分离一个抽象接口和它的实现部分，使得设计可以按两个维度独立扩展。
 * @author: Chestnut
 * @since: 2023-06-30
 **/

/**
 * 电脑类型类（内部持有电脑品牌对象）
 * 电脑类型维度
 */
public class Computer {
    protected Brand brand;

    public Computer(Brand brand) {
        this.brand = brand;
    }

    public void sale() {
        brand.sale();
    }
}

/**
 * 子类-台式机
 */
class Desktop extends Computer {
    public Desktop(Brand brand) {
        super(brand);
    }

    @Override
    public void sale() {
        super.sale();
        System.out.println("销售台式机...");
    }
}

/**
 * 子类-笔记本
 */
class Laptop extends Computer {
    public Laptop(Brand brand) {
        super(brand);
    }

    @Override
    public void sale() {
        super.sale();
        System.out.println("销售笔记本...");
    }
}

/**
 * 子类-平板电脑
 */
class Pad extends Computer {
    public Pad(Brand brand) {
        super(brand);
    }

    @Override
    public void sale() {
        super.sale();
        System.out.println("销售平板电脑...");
    }
}
