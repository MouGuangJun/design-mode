package com.factory;

import com.product.Product;
import com.product.Program;

public class ProgramFactory implements Factory {
    public Product createProduct() {
        return new Program();
    }
}
