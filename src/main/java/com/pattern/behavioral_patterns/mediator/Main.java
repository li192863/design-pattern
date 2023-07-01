package com.pattern.behavioral_patterns.mediator;

/**
 * 测试类
 *
 * @author: Chestnut
 * @since: 2023-07-01
 **/
public class Main {
    public static void main(String[] args) {
        Mediator m = new President();
        Market market = new Market(m);
        Financial financial = new Financial(m);
        Development development = new Development(m);

        market.selfAction();
        market.outAction();
    }
}

/*
专心卖货...
汇报工作, 买多少, 卖多少!
专心数钱...
 */
