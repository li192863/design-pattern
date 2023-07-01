package com.pattern.creational_patterns.prototype.shallow_copy;

import java.util.Calendar;
import java.util.Date;

/**
 * 测试类
 *
 * @author: Chestnut
 * @since: 2023-06-30
 **/
public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        // 浅拷贝
        Date date = new Date(2005 - 1900, Calendar.AUGUST, 3);
        Sheep sheep = new Sheep("懒羊羊", date);
        Sheep dolly = (Sheep) sheep.clone();
        dolly.setName("多莉");

        // Sheep{name='懒羊羊', birthday=Wed Aug 03 00:00:00 CST 2005}
        System.out.println(sheep);
        // Sheep{name='多莉', birthday=Wed Aug 03 00:00:00 CST 2005}
        System.out.println(dolly);

        date.setTime(System.currentTimeMillis());
        // Sheep{name='懒羊羊', birthday=Fri Jun 30 19:53:34 CST 2023}
        System.out.println(sheep);
        // Sheep{name='多莉', birthday=Fri Jun 30 19:53:34 CST 2023}
        System.out.println(dolly);
    }
}

/*
Sheep{name='懒羊羊', birthday=Wed Aug 03 00:00:00 CST 2005}
Sheep{name='多莉', birthday=Wed Aug 03 00:00:00 CST 2005}
Sheep{name='懒羊羊', birthday=Fri Jun 30 19:53:34 CST 2023}
Sheep{name='多莉', birthday=Fri Jun 30 19:53:34 CST 2023}
 */
