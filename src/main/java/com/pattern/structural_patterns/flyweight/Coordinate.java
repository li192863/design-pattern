package com.pattern.structural_patterns.flyweight;

/**
 * 享元（Flyweight）
 * *运用共享技术有效地支持大量细粒度的对象。*
 * * 特点
 *   * 享元模式的设计思想是尽量复用已创建的对象，常用于工厂方法内部的优化。
 * @author: Chestnut
 * @since: 2023-06-30
 **/

/**
 * 外部状态类-棋子的位置
 */
public class Coordinate {
    private int x;
    private int y;

    public Coordinate(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}
