package com.pattern.behavioral_patterns.interpreter;

/**
 * 解释器（Interpreter）
 * *给定一个语言，定义它的文法的一种表示，并定义一个解释器，这个解释器使用该表示来解释语言中的句子。*
 * * 特点
 *   * 解释器模式通过抽象语法树实现对用户输入的解释执行；
 *   * 解释器模式的实现通常非常复杂，且一般只能解决一类特定问题。
 * @author: Chestnut
 * @since: 2024-09-09
 **/

 /**
 * 接口-表达式
 */
public interface Expression {
    public boolean interpret(String context);
}

/**
 * 实现类-终止表达式
 */
class TerminalExpression implements Expression {
    private String data;

    public TerminalExpression(String data) {
        this.data = data;
    }

    @Override
    public boolean interpret(String context) {
        if (context.contains(data)) {
            return true;
        }
        return false;
    }
}

/**
 * 实现类-或表达式
 */
class OrExpression implements Expression {
    private Expression expr1 = null;
    private Expression expr2 = null;

    public OrExpression(Expression expr1, Expression expr2) {
        this.expr1 = expr1;
        this.expr2 = expr2;
    }

    @Override
    public boolean interpret(String context) {
        return expr1.interpret(context) || expr2.interpret(context);
    }
}

/**
 * 实现类-与表达式
 */
class AndExpression implements Expression {
    private Expression expr1 = null;
    private Expression expr2 = null;

    public AndExpression(Expression expr1, Expression expr2) {
        this.expr1 = expr1;
        this.expr2 = expr2;
    }

    @Override
    public boolean interpret(String context) {
        return expr1.interpret(context) && expr2.interpret(context);
    }
}
