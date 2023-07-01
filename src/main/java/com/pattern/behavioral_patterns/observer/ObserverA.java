package com.pattern.behavioral_patterns.observer;

import java.util.Observable;
import java.util.Observer;

/**
 * 观察者（Observer）
 * *定义对象间的一种一对多的依赖关系，当一个对象的状态发生改变时，所有依赖于它的对象都得到通知并被自动更新。*
 * * 特点
 *   * 观察者模式，又称发布-订阅模式，是一种一对多的通知机制，使得双方无需关心对方，只关心通知本身。
 * @author: Chestnut
 * @since: 2023-07-01
 **/

/**
 * 观察者类（实现`java.util.Observable`接口）
 */
public class ObserverA implements Observer {
    /**
     * myState值需要与目标对象保持一致
     */
    private int myState;

    public int getMyState() {
        return myState;
    }

    public void setMyState(int myState) {
        this.myState = myState;
    }

    /**
     * 观察者如何更新
     * @param o     the observable object.
     * @param arg   an argument passed to the <code>notifyObservers</code>
     *                 method.
     */
    @Override
    public void update(Observable o, Object arg) {
        // 更新观察者状态值
        myState = ((ConcreteSubject) o).getState();
    }
}
