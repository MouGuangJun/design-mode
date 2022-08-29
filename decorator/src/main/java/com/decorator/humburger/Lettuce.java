package com.decorator.humburger;

// 生菜（装饰者的第一层）
public class Lettuce extends Condiment {
    public Lettuce(Humburger humburger) {
        super(humburger);
    }

    public String getName() {
        return super.getName() + " 加生菜";
    }

    public double getPrice() {
        return super.getPrice() + 1.5;
    }
}
