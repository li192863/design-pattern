package com.pattern.behavioral_patterns.strategy;

/**
 * 策略（Strategy）
 * *定义一系列的算法，把它们一个个封装起来，并且使它们可相互替换。本模式使得算法可独立于使用它的客户而变化。*
 * * 特点
 *   * 策略模式是为了允许调用方选择一个算法，从而通过不同策略实现不同的计算结果；
 *   * 通过扩展策略，不必修改主逻辑，即可获得新策略的结果。
 * @author: Chestnut
 * @since: 2023-07-01
 **/

/**
 * 接口-策略
 */
public interface Strategy {
    public double getPrice(double standardPrice);
}

/**
 * 实现类-新客户少量
 */
class NewCustomerFewStrategy implements Strategy {
    @Override
    public double getPrice(double standardPrice) {
        System.out.println("不打折");
        return standardPrice;
    }
}

/**
 * 实现类-新客户大量
 */
class NewCustomerManyStrategy implements Strategy {
    @Override
    public double getPrice(double standardPrice) {
        System.out.println("八八折");
        return standardPrice * 0.88;
    }
}

/**
 * 实现类-老客户少量
 */
class OldCustomerFewStrategy implements Strategy {
    @Override
    public double getPrice(double standardPrice) {
        System.out.println("八五折");
        return standardPrice * 0.85;
    }
}

/**
 * 实现类-老客户大量
 */
class OldCustomerManyStrategy implements Strategy {
    @Override
    public double getPrice(double standardPrice) {
        System.out.println("六九折");
        return standardPrice * 0.69;
    }
}
