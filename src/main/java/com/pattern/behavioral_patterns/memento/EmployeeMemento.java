package com.pattern.behavioral_patterns.memento;

/**
 * 备忘录（Memento）
 * *在不破坏封装性的前提下，捕获一个对象的内部状态，并在该对象之外保存这个状态。*
 * * 特点
 *   * 备忘录模式是为了保存对象的内部状态，并在将来恢复，大多数软件提供的保存、打开，以及编辑过程中的Undo、Redo都是备忘录模式的应用。
 * @author: Chestnut
 * @since: 2023-07-01
 **/

/**
 * 备忘录类-员工信息备忘录
 */
public class EmployeeMemento {
    private String name;
    private int age;
    private double salary;

    public EmployeeMemento(Employee employee) {
        this.name = employee.getName();
        this.age = employee.getAge();
        this.salary = employee.getSalary();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
