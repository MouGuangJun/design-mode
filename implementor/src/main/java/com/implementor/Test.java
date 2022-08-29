package com.implementor;

public class Test {
    public static void main(String[] args) {
        ConcreteImplementorA implementorA = new ConcreteImplementorA();
        RefinedAbstractionA refinedAbstractionA = new RefinedAbstractionA(implementorA);
        refinedAbstractionA.refinedOperation();

        RefinedAbstractionB refinedAbstractionB = new RefinedAbstractionB(implementorA);
        refinedAbstractionB.refinedOperation();
    }
}
