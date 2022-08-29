package com.decorator.clothes;

public class Test {
    public static void main(String[] args) {
        Person person = new Person();
        Decorator decorator = new Decorator_two(new Decorator_first(new Decorator_zero(person)));
        decorator.wearClothes();
    }
}
