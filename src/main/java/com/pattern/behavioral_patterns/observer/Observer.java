package com.pattern.behavioral_patterns.observer;

/**
 * 观察者（Observer）
 * *定义对象间的一种一对多的依赖关系，当一个对象的状态发生改变时，所有依赖于它的对象都得到通知并被自动更新。*
 * * 特点
 *   * 观察者模式，又称发布-订阅模式，是一种一对多的通知机制，使得双方无需关心对方，只关心通知本身。
 * @author: Chestnut
 * @since: 2023-07-01
 **/

/**
 * 观察者接口
 */
public interface Observer {
    /**
     * 每当观察对象更改时，将调用此方法。应用程序调用<tt>Observable</tt>对象的<code>notifyObservers</code>方法，
     * 以通知所有观察对象的观察者有关更改的信息。
     *
     * @param   o      可观察对象
     * @param   arg   传递给<code>notifyObservers</code>方法的参数
     */
    void update(Observable o, Object arg);
}
