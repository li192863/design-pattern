package com.pattern.behavioral_patterns.iterator;

import java.util.ArrayList;
import java.util.List;

/**
 * 迭代器（Iterator）
 * *提供一种方法顺序访问一个聚合对象中的各个元素，而又不需要暴露该对象的内部表示。*
 * * 特点
 *   * 迭代器模式常用于遍历集合，它允许集合提供一个统一的`Iterator`接口来遍历元素，同时保证调用者对集合内部的数据结构一无所知，从而使得调用者总是以相同的接口遍历各种不同类型的集合。
 * @author: Chestnut
 * @since: 2023-07-01
 **/

/**
 * 实现类-自定义聚合类（内部类定义迭代器）
 */
public class ConcreteMyAggregate {
    private List<Object> list = new ArrayList<>();

    public void addObject(Object obj) {
        list.add(obj);
    }

    public void removeObject(Object obj) {
        list.remove(obj);
    }

    public List<Object> getList() {
        return list;
    }

    public void setList(List<Object> list) {
        this.list = list;
    }

    /**
     * 获得迭代器
     * @return
     */
    public MyIterator createIterator() {
        return new ConcreteIterator();
    }
    /**
     * 内部类定义迭代器(可直接使用外部类属性)
     */
    private class ConcreteIterator implements MyIterator {
        /**
         * 定义游标
         */
        private int cursor;

        @Override
        public void first() {
            cursor = 0;
        }

        @Override
        public void next() {
            cursor++;
        }

        @Override
        public boolean hasNext() {
            return cursor < list.size();
        }

        @Override
        public boolean isFirst() {
            return cursor == 0;
        }

        @Override
        public boolean isLast() {
            return cursor == list.size() - 1;
        }

        @Override
        public Object getCurrentObject() {
            return list.get(cursor);
        }
    }
}
