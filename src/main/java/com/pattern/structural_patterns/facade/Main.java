package com.pattern.structural_patterns.facade;

/**
 * 测试类
 *
 * @author: Chestnut
 * @since: 2023-06-30
 **/
public class Main {
    public static void main(String[] args) {
        RegisterFacade rf = new RegisterFacade();
        rf.register();
    }
}

/*
在海淀工商局检查名字是否有冲突...
在海淀税务局办理税务登记证...
在中国银行开户...
 */
