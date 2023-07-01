package com.pattern.behavioral_patterns.command;

/**
 * 测试类
 *
 * @author: Chestnut
 * @since: 2023-07-01
 **/
public class Main {
    public static void main(String[] args) {
        Receiver r = new Receiver();
        Command c = new ConcreteCommand(r);
        Invoker i = new Invoker(c);

        i.call();
    }
}

/*
Invoker.call start
ConcreteCommand.execute start
Receiver.action
ConcreteCommand.execute end
Invoker.call end
 */
