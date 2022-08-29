package com.decorator.humburger;

// 辣椒（装饰者的第二层）
public class Chilli extends Condiment {
    public Chilli(Humburger humburger) {
        super(humburger);
    }

    @Override
    public String getName() {
        return super.getName() + " 加辣椒";
    }

    @Override
    public double getPrice() {
        return super.getPrice();// 辣椒是免费的哦
    }
}
