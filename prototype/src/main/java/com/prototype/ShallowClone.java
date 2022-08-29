package com.prototype;

public class ShallowClone extends Prototype {

    @Override
    public Prototype clone() throws CloneNotSupportedException {
        return (Prototype) super.clone();
    }

    @Override
    public void show() {
        System.out.println("浅克隆");
    }
}
