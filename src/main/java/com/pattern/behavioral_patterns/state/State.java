package com.pattern.behavioral_patterns.state;

/**
 * 状态（State）
 * *允许一个对象在其内部状态改变时改变它的行为。对象看起来似乎修改了它的类。*
 * * 特点
 *   * 状态模式的设计思想是把不同状态的逻辑分离到不同的状态类中，从而使得增加新状态更容易；
 *   * 状态模式的实现关键在于状态转换。简单的状态转换可以直接由调用方指定，复杂的状态转换可以在内部根据条件触发完成。
 * @author: Chestnut
 * @since: 2023-07-01
 **/

/**
 * 接口-状态
 */
public interface State {
    void handle();
}

/**
 * 实现类-空闲态
 */
class FreeState implements State {
    @Override
    public void handle() {
        System.out.println("房间空闲中, 可以预定入住! ");
    }
}

/**
 * 实现类-预定态
 */
class BookedState implements State {
    @Override
    public void handle() {
        System.out.println("房间已预定, 可以取消预定! ");
    }
}

/**
 * 实现类-入住态
 */
class CheckedInState implements State {
    @Override
    public void handle() {
        System.out.println("房间已入住, 不可以打扰哦! ");
    }
}
