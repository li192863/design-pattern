package com.pattern.behavioral_patterns.command;

/**
 * 命令者（Command）
 * *将一个请求封装为一个对象，从而使你可用不同的请求对客户进行参数化，对请求排队或记录请求日志，以及支持可撤销的操作。*
 * * 特点
 *   * 命令模式的设计思想是把命令的创建和执行分离，使得调用者无需关心具体的执行过程；
 *   * 通过封装`Command`对象，命令模式可以保存已执行的命令，从而支持撤销、重做等操作。
 * @author: Chestnut
 * @since: 2023-07-01
 **/

/**
 * 调用者/发起者
 */
public class Invoker {
    /**
     * 也可通过容器实现
     */
    private Command command;

    public Invoker(Command command) {
        this.command = command;
    }

    /**
     * 业务方法, 用于调用命令类的方法
     */
    public void call() {
        // 命令执行前或后可以相关处理
        System.out.println("Invoker.call start");
        command.execute();
        System.out.println("Invoker.call end");
    }
}
