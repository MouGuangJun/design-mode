package com.singleton;

// 饿汉式单例类.在类初始化时，已经自行实例化
public class Singleton4 {
    private Singleton4() {
    }

    private static final Singleton4 singleton4 = new Singleton4();

    // 静态工厂方法
    public static Singleton4 getInstance() {
        return singleton4;
    }
}
