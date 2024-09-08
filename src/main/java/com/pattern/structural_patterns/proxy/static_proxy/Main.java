package com.pattern.structural_patterns.proxy.static_proxy;

/**
 * 测试类
 *
 * @author: Chestnut
 * @since: 2023-06-30
 **/
public class Main {
    public static void main(String[] args) {
        Star real = new RealStar();
        Star proxy = new ProxyStar(real);

        proxy.sing();
    }
}

/*
[真正方法执行前]面谈, 签合同, 预付款, 顶机票...
RealStar.sing...
[真正方法执行后]收尾款...
 */
