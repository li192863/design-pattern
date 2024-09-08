package com.pattern.structural_patterns.flyweight;

/**
 * 测试类
 *
 * @author: Chestnut
 * @since: 2023-06-30
 **/
public class Main {
    /*
     * 棋子可选的颜色
     */
    private static String[] colors = { "红", "绿", "蓝", "白", "黑" };

    public static void main(String[] args) {
        for (int i = 0; i < 20; i++) {
            ChessFlyWeight chess1 = ChessFlyWeightFactory.getChess(getRandomColor());
            // 增加外部状态的处理
            chess1.display(new Coordinate(getRandomX(), getRandomY()));
        }
    }

    private static String getRandomColor() {
        return colors[(int) (Math.random() * colors.length)];
    }

    private static int getRandomX() {
        return (int) (Math.random() * 100);
    }

    private static int getRandomY() {
        return (int) (Math.random() * 100);
    }
}

/*
创建并缓存蓝棋(com.pattern.structural_patterns.flyweight.ConcreteChess@4d7e1886)
蓝棋落于点(18, 62)
创建并缓存黑棋(com.pattern.structural_patterns.flyweight.ConcreteChess@2f0e140b)
黑棋落于点(0, 22)
蓝棋落于点(38, 26)
蓝棋落于点(0, 74)
创建并缓存绿棋(com.pattern.structural_patterns.flyweight.ConcreteChess@7440e464)
绿棋落于点(55, 80)
蓝棋落于点(77, 1)
创建并缓存红棋(com.pattern.structural_patterns.flyweight.ConcreteChess@49476842)
红棋落于点(15, 95)
黑棋落于点(58, 76)
蓝棋落于点(8, 17)
红棋落于点(64, 23)
蓝棋落于点(72, 78)
蓝棋落于点(44, 40)
黑棋落于点(41, 44)
绿棋落于点(13, 66)
绿棋落于点(30, 50)
绿棋落于点(41, 0)
黑棋落于点(80, 10)
红棋落于点(20, 37)
黑棋落于点(33, 50)
红棋落于点(84, 23)
 */
