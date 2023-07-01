package com.pattern.behavioral_patterns.strategy;

/**
 * 策略（Strategy）
 * *定义一系列的算法，把它们一个个封装起来，并且使它们可相互替换。本模式使得算法可独立于使用它的客户而变化。*
 * * 特点
 *   * 策略模式是为了允许调用方选择一个算法，从而通过不同策略实现不同的计算结果；
 *   * 通过扩展策略，不必修改主逻辑，即可获得新策略的结果。
 * @author: Chestnut
 * @since: 2023-07-01
 **/

/**
 * 上下文类（负责与策略类交互, 实现算法与客户端分离）
 */
public class Context {
    /**
     * 当前采用算法策略
     */
    private Strategy strategy;

    /**
     * 构造方法注入
     * @param strategy
     */
    public Context(Strategy strategy) {
        this.strategy = strategy;
    }

    /**
     * setter注入
     * @param strategy
     */
    public void setStrategy(Strategy strategy) {
        this.strategy = strategy;
    }

    public void printPrice(double standardPrice) {
        System.out.println("您的报价为" + strategy.getPrice(standardPrice));
    }
}
