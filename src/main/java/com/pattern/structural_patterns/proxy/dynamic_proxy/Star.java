package com.pattern.structural_patterns.proxy.dynamic_proxy;

/**
 * 代理（Proxy）
 * *为其他对象提供一种代理以控制对这个对象的访问。*
 * * 特点
 *   * 代理模式通过封装一个已有接口，并向调用方返回相同的接口类型，能让调用方在不改变任何代码的前提下增强某些功能（例如，鉴权、延迟加载、连接池复用等）；
 *   * 使用代理模式要求调用方持有接口，作为代理的类也必须实现相同的接口类型。
 * @author: Chestnut
 * @since: 2023-06-30
 **/

/**
 * 接口-明星
 */
public interface Star {
    /**
     * 面谈
     */
    void confer();

    /**
     * 签合同
     */
    void signContract();

    /**
     * 订票
     */
    void bookTicket();

    /**
     * 唱歌
     */
    void sing();

    /**
     * 挣钱
     */
    void collectMoney();
}
