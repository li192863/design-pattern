package com.pattern.behavioral_patterns.memento;

/**
 * 测试类
 *
 * @author: Chestnut
 * @since: 2023-07-01
 **/
public class Main {
    public static void main(String[] args) {
        CareTaker careTaker = new CareTaker();
        Employee employee = new Employee("小李", 23, 300.0);
        // Employee{name='小李', age=23, salary=300.0}
        System.out.println(employee);

        // 备忘数据
        careTaker.setMemento(employee.memento());

        employee.setName("小陈");
        employee.setAge(22);
        employee.setSalary(3000.0);
        // Employee{name='小陈', age=22, salary=3000.0}
        System.out.println(employee);

        // 恢复数据
        employee.recover(careTaker.getMemento());

        // Employee{name='小李', age=23, salary=300.0}
        System.out.println(employee);
    }
}

/*
Employee{name='小李', age=23, salary=300.0}
Employee{name='小陈', age=22, salary=3000.0}
Employee{name='小李', age=23, salary=300.0}
 */
