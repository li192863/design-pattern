package com.pattern.structural_patterns.flyweight;

/**
 * 测试类
 *
 * @author: Chestnut
 * @since: 2023-06-30
 **/
public class Main {
    public static void main(String[] args) {
        ChessFlyWeight chess1 = ChessFlyWeightFactory.getChess("黑");
        ChessFlyWeight chess2 = ChessFlyWeightFactory.getChess("白");
        ChessFlyWeight chess3 = ChessFlyWeightFactory.getChess("黑");
        // com.pattern.structural_patterns.flyweight.ConcreteChess@1b6d3586
        System.out.println(chess1);
        // com.pattern.structural_patterns.flyweight.ConcreteChess@4554617c
        System.out.println(chess2);
        // com.pattern.structural_patterns.flyweight.ConcreteChess@1b6d3586
        System.out.println(chess3);

        System.out.println("-----增加外部状态的处理-----");
        chess1.display(new Coordinate(10, 10));
        chess2.display(new Coordinate(10, 11));
        chess3.display(new Coordinate(11, 10));
    }
}

/*
com.pattern.structural_patterns.flyweight.ConcreteChess@1b6d3586
com.pattern.structural_patterns.flyweight.ConcreteChess@4554617c
com.pattern.structural_patterns.flyweight.ConcreteChess@1b6d3586
-----增加外部状态的处理-----
黑棋落于点(10, 10)
白棋落于点(10, 11)
黑棋落于点(11, 10)
 */
