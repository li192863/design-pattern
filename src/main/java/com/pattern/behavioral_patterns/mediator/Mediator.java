package com.pattern.behavioral_patterns.mediator;

import java.util.HashMap;
import java.util.Map;

/**
 * 中介（Mediator）
 * *用一个中介对象来封装一系列的对象交互。中介者使各个对象不需要显式地相互引用，从而使其耦合松散，而且可以独立地改变它们之间的交互。*
 * * 特点
 *   * 中介模式是通过引入一个中介对象，把多边关系变成多个双边关系，从而简化系统组件的交互耦合度；
 *   * 中介模式经常用在有众多交互组件的UI上。为了简化UI程序，MVC模式以及MVVM模式都可以看作是中介模式的扩展。
 * @author: Chestnut
 * @since: 2023-07-01
 **/

/**
 * 接口-中介
 */
public interface Mediator {
    void register(String dname, Department d);
    void command(String dname);
}

/**
 * 实现类-总统
 */
class President implements Mediator {
    private Map<String, Department> map = new HashMap<>();

    @Override
    public void register(String dname, Department d) {
        map.put(dname, d);
    }

    @Override
    public void command(String dname) {
        map.get(dname).selfAction();
    }
}
