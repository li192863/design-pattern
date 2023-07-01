package com.pattern.behavioral_patterns.chain_of_responsibility;

/**
 * 责任链（Chain of Responsibility）
 * *使多个对象都有机会处理请求，从而避免请求的发送者和接收者之间的耦合关系。将这些对象连成一条链，并沿着这条链传递该请求，直到有一个对象处理它为止。*
 * * 特点
 *   * 责任链模式是一种把多个处理器组合在一起，依次处理请求的模式；
 *   * 责任链模式的好处是添加新的处理器或者重新排列处理器非常容易；
 *   * 责任链模式经常用在拦截、预处理请求等。
 * @author: Chestnut
 * @since: 2023-07-01
 **/

/**
 * 抽象类-领导
 */
public abstract class Leader {
    protected String name;
    /**
     * 责任链上的后继对象
     */
    protected Leader nextLeader;

    public Leader(String name) {
        this.name = name;
    }

    /**
     * 设定责任链下一对象
     * @param nextLeader
     */
    public void setNextLeader(Leader nextLeader) {
        this.nextLeader = nextLeader;
    }

    /**
     * 处理请求的业务代码
     * @param request
     */
    public abstract void handleRequest(LeaveRequest request);
}

/**
 * 子类-主任
 */
class Director extends Leader {
    public Director(String name) {
        super(name);
    }

    @Override
    public void handleRequest(LeaveRequest request) {
        if (request.getLeaveDays() < 3) {
            System.out.println("员工" + request.getEmpName() + "请假" + request.getLeaveDays() + "天, 理由是" + request.getReason());
            System.out.println(this.name + "主任审批通过...");
        } else {
            if (this.nextLeader != null) {
                this.nextLeader.handleRequest(request);
            }
        }
    }
}

/**
 * 子类-经理
 */
class Manager extends Leader {
    public Manager(String name) {
        super(name);
    }

    @Override
    public void handleRequest(LeaveRequest request) {
        if (request.getLeaveDays() < 10) {
            System.out.println("员工" + request.getEmpName() + "请假" + request.getLeaveDays() + "天, 理由是" + request.getReason());
            System.out.println(this.name + "经理审批通过...");
        } else {
            if (this.nextLeader != null) {
                this.nextLeader.handleRequest(request);
            }
        }
    }
}

/**
 * 子类-副总经理
 */
class ViceGeneralManager extends Leader {
    public ViceGeneralManager(String name) {
        super(name);
    }

    @Override
    public void handleRequest(LeaveRequest request) {
        if (request.getLeaveDays() < 20) {
            System.out.println("员工" + request.getEmpName() + "请假" + request.getLeaveDays() + "天, 理由是" + request.getReason());
            System.out.println(this.name + "副总经理审批通过...");
        } else {
            if (this.nextLeader != null) {
                this.nextLeader.handleRequest(request);
            }
        }
    }
}

/**
 * 子类-总经理
 */
class GeneralManager extends Leader {
    public GeneralManager(String name) {
        super(name);
    }

    @Override
    public void handleRequest(LeaveRequest request) {
        if (request.getLeaveDays() < 30) {
            System.out.println("员工" + request.getEmpName() + "请假" + request.getLeaveDays() + "天, 理由是" + request.getReason());
            System.out.println(this.name + "总经理审批通过...");
        } else {
            System.out.println("莫非" + request.getEmpName() + "想辞职, 居然请假" + request.getLeaveDays() + "天? ");
        }
    }
}
