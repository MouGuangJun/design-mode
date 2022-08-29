package com.implementor;

public class RefinedAbstractionA extends Abstraction {
    public RefinedAbstractionA(Implementor implementor) {
        super(implementor);
    }

    public void refinedOperation() {
        super.operation();
        System.out.println("RefinedAbstractionA 对 Abstraction 中的 operation 方法进行扩展");
    }
}
