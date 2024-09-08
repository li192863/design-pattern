package com.pattern.behavioral_patterns.visitor;

/**
 * 访问者（Visitor）
 * *表示一个作用于某对象结构中的各元素的操作。它使你可以在不改变各元素的类的前提下定义作用于这些元素的新操作。*
 * * 特点
 *   * 访问者模式是为了抽象出作用于一组复杂对象的操作，并且后续可以新增操作而不必对现有的对象结构做任何改动。
 * @author: Chestnut
 * @since: 2024-09-09
 **/

/**
 * 接口-电脑部件
 */
public interface ComputerPart {
    public void accept(ComputerPartVisitor computerPartVisitor);
}

/**
 * 实现类-键盘部件
 */
class Keyboard implements ComputerPart {
    @Override
    public void accept(ComputerPartVisitor computerPartVisitor) {
        computerPartVisitor.visit(this);
    }
}

/**
 * 实现类-显示器部件
 */
class Monitor implements ComputerPart {
    @Override
    public void accept(ComputerPartVisitor computerPartVisitor) {
        computerPartVisitor.visit(this);
    }
}

/**
 * 实现类-鼠标部件
 */
class Mouse implements ComputerPart {
    @Override
    public void accept(ComputerPartVisitor computerPartVisitor) {
        computerPartVisitor.visit(this);
    }
}

/**
 * 实现类-电脑部件
 */
class Computer implements ComputerPart {
    ComputerPart[] parts;

    public Computer() {
        parts = new ComputerPart[] { new Mouse(), new Keyboard(), new Monitor() };
    }

    @Override
    public void accept(ComputerPartVisitor computerPartVisitor) {
        for (int i = 0; i < parts.length; i++) {
            parts[i].accept(computerPartVisitor);
        }
        computerPartVisitor.visit(this);
    }
}
