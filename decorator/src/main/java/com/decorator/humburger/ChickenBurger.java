package com.decorator.humburger;

// 鸡腿堡类（被装饰者的初始状态，有些自己的简单装饰）
public class ChickenBurger implements Humburger {
    public String getName() {
        return "鸡腿堡";
    }

    public double getPrice() {
        return 10;
    }
}
