package com.decorator.humburger;

// 配料的基类（装饰者，用来对汉堡进行多层装饰，每层装饰增加一些配料）
public class Condiment implements Humburger {
    private Humburger humburger;

    public Condiment(Humburger humburger) {
        this.humburger = humburger;
    }

    public String getName() {
        return humburger.getName();
    }

    public double getPrice() {
        return humburger.getPrice();
    }
}
