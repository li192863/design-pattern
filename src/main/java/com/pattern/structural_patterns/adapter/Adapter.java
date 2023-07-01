package com.pattern.structural_patterns.adapter;

/**
 * 适配器（Adapter）
 * *将一个类的接口转换成客户希望的另外一个接口，使得原本由于接口不兼容而不能一起工作的那些类可以一起工作。*
 * * 特点
 *   * 适配器模式可以将一个A接口转换为B接口，使得新的对象符合B接口规范；
 *   * 编写适配器实际上就是编写一个实现了B接口，并且内部持有A接口的类；
 *   * 在适配器内部将B接口的调用“转换”为对A接口的调用。
 * @author: Chestnut
 * @since: 2023-06-30
 **/

/**
 * 适配器类（实现目标接口，内部持有被适配对象，对目标接口的调用`handleRequest`需转化为对被适配对象的调用`request`）
 */
public class Adapter implements Target {
    private Adaptee adaptee;

    public Adapter(Adaptee adaptee) {
        this.adaptee = adaptee;
    }

    @Override
    public void handleRequest() {
        adaptee.request();
    }
}
