package com.pattern.behavioral_patterns.iterator;

/**
 * 迭代器（Iterator）
 * *提供一种方法顺序访问一个聚合对象中的各个元素，而又不需要暴露该对象的内部表示。*
 * * 特点
 *   * 迭代器模式常用于遍历集合，它允许集合提供一个统一的`Iterator`接口来遍历元素，同时保证调用者对集合内部的数据结构一无所知，从而使得调用者总是以相同的接口遍历各种不同类型的集合。
 * @author: Chestnut
 * @since: 2023-07-01
 **/

/**
 * 接口-自定义迭代器
 */
public interface MyIterator {
    /**
     * 将游标指向第一个元素
     */
    void first();

    /**
     * 将游标指向下一个元素
     */
    void next();

    /**
     * 判断是否存在下一个元素
     * @return
     */
    boolean hasNext();

    /**
     * 判断是否为第一个元素
     * @return
     */
    boolean isFirst();

    /**
     * 判断是否为最后一个元素
     * @return
     */
    boolean isLast();

    /**
     * 获得当前游标指向的元素
     * @return
     */
    Object getCurrentObject();
}
