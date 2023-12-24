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
 * 目标对象（继承`java.util.Observable`类）
 */
public class ConcreteSubject extends Observable {
    private int state;

    public int getState() {
        return state;
    }

    public void setState(int state) {
        // 目标对象状态发生改变
        this.state = state;
        // 表示目标对象已经做出更改
        setChanged();
        // 通知所有观察者(原理: 遍历容器更改观察者状态)
        notifyObservers(state);
    }
}
