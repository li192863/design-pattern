package com.pattern.behavioral_patterns.observer;

/**
 * 测试类
 *
 * @author: Chestnut
 * @since: 2023-07-01
 **/
public class Main {
    public static void main(String[] args) {
        // 创建目标对象
        ConcreteSubject subject = new ConcreteSubject();

        // 创建观察者对象
        ObserverA obs1 = new ObserverA();
        ObserverA obs2 = new ObserverA();
        ObserverA obs3 = new ObserverA();

        // 目标对象容器中添加观察对象
        // 添加观察者(原理: 目标对象容器内添加观察者)
        subject.addObserver(obs1);
        subject.addObserver(obs2);
        subject.addObserver(obs3);

        System.out.println("-----初始状态-----");
        System.out.println(obs1.getMyState());
        System.out.println(obs2.getMyState());
        System.out.println(obs3.getMyState());
        // 改变目标对象状态
        System.out.println("-----更改状态-----");
        subject.setState(300);
        System.out.println(obs1.getMyState());
        System.out.println(obs2.getMyState());
        System.out.println(obs3.getMyState());

        // 目标对象容器中删除观察对象
        // 删除观察者(原理: 目标对象容器内删除观察者)
        subject.deleteObserver(obs2);
        // 改变目标对象状态
        System.out.println("-----更改状态-----");
        subject.setState(600);
        System.out.println(obs1.getMyState());
        System.out.println(obs2.getMyState());
        System.out.println(obs3.getMyState());
    }
}

/*
-----初始状态-----
0
0
0
-----更改状态-----
300
300
300
-----更改状态-----
600
300
600
 */
