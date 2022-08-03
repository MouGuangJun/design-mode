package com.simple.factory;

public class Test {
    public static void main(String[] args) throws Exception {
        TV haier = TVFactory.produceTV("Haier");
        haier.play();
    }
}
