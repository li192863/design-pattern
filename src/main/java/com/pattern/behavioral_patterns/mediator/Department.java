package com.pattern.behavioral_patterns.mediator;

/**
 * 中介（Mediator）
 * *用一个中介对象来封装一系列的对象交互。中介者使各个对象不需要显式地相互引用，从而使其耦合松散，而且可以独立地改变它们之间的交互。*
 * * 特点
 *   * 中介模式是通过引入一个中介对象，把多边关系变成多个双边关系，从而简化系统组件的交互耦合度；
 *   * 中介模式经常用在有众多交互组件的UI上。为了简化UI程序，MVC模式以及MVVM模式都可以看作是中介模式的扩展。
 * @author: Chestnut
 * @since: 2023-07-01
 **/

/**
 * 接口-同事
 */
public interface Department {
    /**
     * 做本部门的事
     */
    void selfAction();

    /**
     * 向总经理申请
     */
    void outAction();
}

/**
 * 实现类-研发部
 */
class Development implements Department {
    /**
     * 持有中介者(总经理)对象
     */
    private Mediator mediator;

    public Development(Mediator mediator) {
        this.mediator = mediator;
        mediator.register("development", this);
    }

    @Override
    public void selfAction() {
        System.out.println("专心科研...");
    }

    @Override
    public void outAction() {
        System.out.println("汇报工作, 没钱了, 我要钱! ");
    }
}

/**
 * 实现类-财务部
 */
class Financial implements Department {
    /**
     * 持有中介者(总经理)对象
     */
    private Mediator mediator;

    public Financial(Mediator mediator) {
        this.mediator = mediator;
        mediator.register("financial", this);
    }

    @Override
    public void selfAction() {
        System.out.println("专心数钱...");
    }

    @Override
    public void outAction() {
        System.out.println("汇报工作, 钱太多, 怎么花? ");
    }
}

/**
 * 实现类-市场部
 */
class Market implements Department {
    /**
     * 持有中介者(总经理)对象
     */
    private Mediator mediator;

    public Market(Mediator mediator) {
        this.mediator = mediator;
        mediator.register("market", this);
    }

    @Override
    public void selfAction() {
        System.out.println("专心卖货...");
    }

    @Override
    public void outAction() {
        System.out.println("汇报工作, 买多少, 卖多少! ");

        mediator.command("financial");
    }
}
