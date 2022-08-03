package com.factory;

import com.product.Product;

public class Test {
    public static void main(String[] args) {
        Factory factory = new FoodFactory();
        Product product = factory.createProduct();
        product.show();

        factory = new ProgramFactory();
        product = factory.createProduct();
        product.show();
    }
}
