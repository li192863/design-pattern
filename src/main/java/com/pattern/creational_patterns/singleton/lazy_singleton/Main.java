package com.pattern.creational_patterns.singleton.lazy_singleton;

/**
 * 测试类
 *
 * @author: Chestnut
 * @since: 2023-06-30
 **/
public class Main {
    public static void main(String[] args) {
        LazySingleton ls1 = LazySingleton.getInstance();
        LazySingleton ls2 = LazySingleton.getInstance();
        System.out.println(ls1);
        System.out.println(ls2);
        System.out.println(ls1 == ls2);
    }
}

/*
com.pattern.creational_patterns.singleton.lazy_singleton.LazySingleton@1b6d3586
com.pattern.creational_patterns.singleton.lazy_singleton.LazySingleton@1b6d3586
true
 */
