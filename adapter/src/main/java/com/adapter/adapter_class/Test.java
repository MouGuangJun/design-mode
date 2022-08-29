package com.adapter.adapter_class;

public class Test {
    public static void main(String[] args) {
        // 请求自身普通功能
        ConcreteTarget concreteTarget = new ConcreteTarget();
        concreteTarget.request();

        // 请求目标特殊功能
        Adapter adapter = new Adapter();
        adapter.request();
    }
}
