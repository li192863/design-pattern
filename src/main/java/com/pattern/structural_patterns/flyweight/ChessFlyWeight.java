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
 * 享元接口-棋子
 */
public interface ChessFlyWeight {
    void setColor(String c);
    String getColor();
    void display(Coordinate c);
}

/**
 * 享元类-棋子
 */
class ConcreteChess implements ChessFlyWeight {
    private String color;

    public ConcreteChess(String color) {
        this.color = color;
    }

    @Override
    public void setColor(String c) {
        this.color = c;
    }

    @Override
    public String getColor() {
        return color;
    }

    @Override
    public void display(Coordinate c) {
        System.out.println(color + "棋落于点(" + c.getX() + ", " + c.getY() + ")");
    }
}
