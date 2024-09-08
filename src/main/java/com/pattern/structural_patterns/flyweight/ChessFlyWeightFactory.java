package com.pattern.structural_patterns.flyweight;

import java.util.HashMap;
import java.util.Map;

/**
 * 享元（Flyweight）
 * *运用共享技术有效地支持大量细粒度的对象。*
 * * 特点
 *   * 享元模式的设计思想是尽量复用已创建的对象，常用于工厂方法内部的优化。
 * @author: Chestnut
 * @since: 2023-06-30
 **/

/**
 * 享元工厂类
 */
public class ChessFlyWeightFactory {
    /**
     * 享元池
     */
    private static Map<String, ChessFlyWeight> map = new HashMap<>();

    public static ChessFlyWeight getChess(String color) {
        ChessFlyWeight chess = map.get(color);
        if (chess == null) {
            ChessFlyWeight cfw = new ConcreteChess(color);
            map.put(color, cfw);
            System.out.println("创建并缓存" + color + "棋(" + cfw + ")");
            chess = cfw;
        }
        return chess;
    }
}
