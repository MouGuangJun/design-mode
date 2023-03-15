package com.chain.product;

public interface Processor {
    boolean process(Product request, ProcessorChain chain);
}