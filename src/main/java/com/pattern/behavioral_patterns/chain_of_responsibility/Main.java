package com.pattern.behavioral_patterns.chain_of_responsibility;

/**
 * 测试类
 *
 * @author: Chestnut
 * @since: 2023-07-01
 **/
public class Main {
    public static void main(String[] args) {
        // 生成领导们
        Leader a = new Director("小孙");
        Leader b = new Manager("小李");
        Leader c = new ViceGeneralManager("小张");
        Leader d = new GeneralManager("小陈");

        // 组织责任链
        a.setNextLeader(b);
        b.setNextLeader(c);
        c.setNextLeader(d);

        // 开始请假
        LeaveRequest request = new LeaveRequest("小王", 15, "想和对象旅游...");
        a.handleRequest(request);
    }
}

/*
员工小王请假15天, 理由是想和对象旅游...
小张副总经理审批通过...
 */
