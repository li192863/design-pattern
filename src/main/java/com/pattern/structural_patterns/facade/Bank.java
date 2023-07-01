package com.pattern.structural_patterns.facade;

/**
 * 外观（Facade）
 * *为子系统中的一组接口提供一个一致的界面。外观模式定义了一个高层接口，这个接口使得这一子系统更加容易使用。*
 * * 特点
 *   * 外观模式是为了给客户端提供一个统一入口，并对外屏蔽内部子系统的调用细节。
 * @author: Chestnut
 * @since: 2023-06-30
 **/

/**
 * 接口-银行
 * 银行开户
 */
public interface Bank {
    /**
     * 开户
     */
    void openAccount();
}

/**
 * 实现类-中国银行
 */
class ChinaBank implements Bank {
    @Override
    public void openAccount() {
        System.out.println("在中国银行开户...");
    }
}
