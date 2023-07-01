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
 * 接口-命令
 */
public interface Command {
    /**
     * 实际项目可根据需求设计多个不同方法
     */
    void execute();
}

/**
 * 实现类-命令
 */
class ConcreteCommand implements Command {
    /**
     * 命令真正执行者
     */
    private Receiver receiver;

    public ConcreteCommand(Receiver receiver) {
        this.receiver = receiver;
    }

    @Override
    public void execute() {
        // 命令执行前或后可以相关处理
        System.out.println("ConcreteCommand.execute start");
        receiver.action();
        System.out.println("ConcreteCommand.execute end");
    }
}
