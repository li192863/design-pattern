package com.pattern.behavioral_patterns.iterator;

/**
 * 测试类
 *
 * @author: Chestnut
 * @since: 2023-07-01
 **/
public class Main {
    public static void main(String[] args) {
        ConcreteMyAggregate cma = new ConcreteMyAggregate();
        cma.addObject("aa");
        cma.addObject("bb");
        cma.addObject("cc");
        cma.addObject("dd");
        cma.addObject("ee");
        cma.addObject("ff");

        MyIterator iterator = cma.createIterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.getCurrentObject());
            iterator.next();
        }
    }
}

/*
aa
bb
cc
dd
ee
ff
 */
