package com.pattern.behavioral_patterns.state;

/**
 * 测试类
 *
 * @author: Chestnut
 * @since: 2023-07-01
 **/
public class Main {
    public static void main(String[] args) {
        RoomContext context = new RoomContext();
        context.setState(new FreeState());
        context.setState(new BookedState());
        context.setState(new CheckedInState());
    }
}

/*
房间空闲中, 可以预定入住!
房间已预定, 可以取消预定!
房间已入住, 不可以打扰哦!
 */
