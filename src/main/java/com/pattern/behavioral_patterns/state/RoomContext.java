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
 * 状态类-房间（维持状态切换）
 */
public class RoomContext {
    private State state;

    public void setState(State state) {
        this.state = state;
        state.handle();
    }
}
