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
 * 接口-电脑品牌
 * 电脑品牌维度
 */
public interface Brand {
    void sale();
}

/**
 * 实现类-联想品牌
 */
class Lenovo implements Brand {
    @Override
    public void sale() {
        System.out.println("销售联想产品！");
    }
}

/**
 * 实现类-戴尔品牌
 */
class Dell implements Brand {
    @Override
    public void sale() {
        System.out.println("销售戴尔产品！");
    }
}

/**
 * 实现类-苹果品牌
 */
class Apple implements Brand {
    @Override
    public void sale() {
        System.out.println("销售苹果产品！");
    }
}
