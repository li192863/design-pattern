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
 * 负责人类-负责管理备忘录对象
 */
public class CareTaker {
    /**
     * 备忘录较多时可考虑使用栈
     */
    private EmployeeMemento memento;

    public EmployeeMemento getMemento() {
        return memento;
    }

    public void setMemento(EmployeeMemento memento) {
        this.memento = memento;
    }
}
