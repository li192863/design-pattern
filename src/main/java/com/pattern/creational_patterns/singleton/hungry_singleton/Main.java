package com.pattern.creational_patterns.singleton.hungry_singleton;

/**
 * 测试类
 *
 * @author: Chestnut
 * @since: 2023-06-30
 **/
public class Main {
    public static void main(String[] args) {
        HungrySingleton hs1 = HungrySingleton.getInstance();
        HungrySingleton hs2 = HungrySingleton.getInstance();
        System.out.println(hs1);
        System.out.println(hs2);
        System.out.println(hs1 == hs2);
    }
}

/*
com.pattern.creational_patterns.singleton.hungry_singleton.HungrySingleton@1b6d3586
com.pattern.creational_patterns.singleton.hungry_singleton.HungrySingleton@1b6d3586
true
 */
