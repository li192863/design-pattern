package com.pattern.behavioral_patterns.visitor;

/**
 * 测试类
 *
 * @author: Chestnut
 * @since: 2024-09-09
 **/
public class Main {
    public static void main(String[] args) {
        ComputerPart computer = new Computer();
        computer.accept(new ComputerPartDisplayVisitor());
    }
}

/*
Displaying Mouse.
Displaying Keyboard.
Displaying Monitor.
Displaying Computer.
 */
