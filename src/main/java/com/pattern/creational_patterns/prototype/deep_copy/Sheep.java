package com.pattern.creational_patterns.prototype.deep_copy;

import java.util.Date;

/**
 * 原型（Prototype）
 * *用原型实例指定创建对象的种类，并且通过拷贝这些原型创建新的对象。*
 * * 特点
 *   * 原型模式是根据一个现有对象实例复制出一个新的实例，复制出的类型和属性与原实例相同；
 *   * 通过`new`产生对象需要非常繁琐的数据准备或访问权限，则可以使用原型模式。
 * @author: Chestnut
 * @since: 2023-06-30
 **/

/**
 * 深拷贝-羊类（实现`java.lang.Cloneable`接口）
 */
public class Sheep implements Cloneable {
    private String name;
    private Date birthday;

    @Override
    protected Object clone() throws CloneNotSupportedException {
        // 深拷贝
        Object obj = super.clone();
        Sheep sheep = (Sheep) obj;
        sheep.birthday = (Date) this.birthday.clone();
        return sheep;
    }

    public Sheep(String name, Date birthday) {
        this.name = name;
        this.birthday = birthday;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    @Override
    public String toString() {
        return "Sheep{" +
                "name='" + name + '\'' +
                ", birthday=" + birthday +
                '}';
    }
}
