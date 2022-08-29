package com.decorator.clothes;

// 定时装饰者
public class Decorator implements Human {
    private Human human;

    public Decorator(Human human) {
        this.human = human;
    }

    public void wearClothes() {
        human.wearClothes();
    }
}
