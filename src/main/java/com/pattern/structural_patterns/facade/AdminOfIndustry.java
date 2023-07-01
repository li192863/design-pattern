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
 * 接口-工商局
 * 工商注册
 */
public interface AdminOfIndustry {
    /**
     * 核名
     */
    void checkName();
}

/**
 * 实现类-海淀工商局
 */
class HaidianAdminOfIndustry implements AdminOfIndustry {
    @Override
    public void checkName() {
        System.out.println("在海淀工商局检查名字是否有冲突...");
    }
}
