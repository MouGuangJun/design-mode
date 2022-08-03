package com.factory;

import com.product.Food;
import com.product.Product;

public class FoodFactory implements Factory {
    public Product createProduct() {
        return new Food();
    }
}
