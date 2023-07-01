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
 * 注册公司类
 * 办理注册公司流程的门面对象类
 */
public class RegisterFacade {
    public void register() {
        AdminOfIndustry a = new HaidianAdminOfIndustry();
        a.checkName();

        Taxation t = new HaidianTaxation();
        t.taxCertificate();

        Bank b = new ChinaBank();
        b.openAccount();
    }
}
