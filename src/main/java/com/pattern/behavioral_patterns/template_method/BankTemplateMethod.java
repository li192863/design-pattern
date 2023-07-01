package com.pattern.behavioral_patterns.template_method;

/**
 * 模板方法（Template Method）
 * *定义一个操作中的算法的骨架，而将一些步骤延迟到子类中，使得子类可以不改变一个算法的结构即可重定义该算法的某些特定步骤。*
 * * 特点
 *   * 模板方法是一种高层定义骨架，底层实现细节的设计模式，适用于流程固定，但某些步骤不确定或可替换的情况。
 * @author: Chestnut
 * @since: 2023-07-01
 **/

/**
 * 抽象类-空模板方法
 */
public abstract class BankTemplateMethod {
    public void takeNumber() {
        System.out.println("取号排队...");
    }

    /**
     * 钩子方法-办理业务方法
     */
    public abstract void transact();

    public void evaluate() {
        System.out.println("反馈评分...");
    }

    /**
     * 模板方法
     */
    public final void process() {
        this.takeNumber();
        this.transact();
        this.evaluate();
    }
}

/**
 * 子类-取钱
 */
class DrawMoney extends BankTemplateMethod {
    @Override
    public void transact() {
        System.out.println("我要取钱!!!");
    }
}

/**
 * 子类-开户
 */
class OpenAccount extends BankTemplateMethod {
    @Override
    public void transact() {
        System.out.println("我要开户!!!");
    }
}
