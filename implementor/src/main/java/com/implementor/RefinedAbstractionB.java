package com.implementor;

public class RefinedAbstractionB extends Abstraction {
    public RefinedAbstractionB(Implementor implementor) {
        super(implementor);
    }

    public void refinedOperation() {
        super.operation();
        System.out.println("RefinedAbstractionB 对 Abstraction 中的 operation 方法进行扩展");
    }
}
