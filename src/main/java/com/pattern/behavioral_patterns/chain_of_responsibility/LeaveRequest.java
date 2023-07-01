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
 * 请假条类
 * 封装请假条
 */
public class LeaveRequest {
    private String empName;
    private int leaveDays;
    private String reason;

    public LeaveRequest(String empName, int leaveDays, String reason) {
        this.empName = empName;
        this.leaveDays = leaveDays;
        this.reason = reason;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public int getLeaveDays() {
        return leaveDays;
    }

    public void setLeaveDays(int leaveDays) {
        this.leaveDays = leaveDays;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }
}
