package com.pattern.creational_patterns.singleton.hungry_singleton;

/**
 * 单例（Singleton）
 * *保证一个类仅有一个实例，并提供一个访问它的全局访问点。*
 * * 特点
 *   * 单例模式是为了保证一个程序的运行期间，某个类有且只有一个全局唯一实例；
 *   * 单例模式既可以严格实现，也可以以约定的方式把普通类视作单例。
 * @author: Chestnut
 * @since: 2023-06-30
 **/

/**
 * 单例对象立即加载-饿汉式单例
 */
public class HungrySingleton {
    private static final HungrySingleton instance = new HungrySingleton();

    private HungrySingleton() {
    }

    public static HungrySingleton getInstance() {
        return instance;
    }
}
