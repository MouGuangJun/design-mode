package com.singleton;


// 懒汉式单例类.在第一次调用的时候实例化自己
public class Singleton2 {
    private Singleton2() {
    }

    // volatile防止指令重排
    // 先执行singleton2 = new Singleton2()的操作导致另一个线程获取到了singleton2但值为空
    private volatile static Singleton2 singleton2 = null;

    public static Singleton2 getInstance() {
        if (singleton2 == null) {
            synchronized (Singleton2.class) {
                if (singleton2 == null) {
                    singleton2 = new Singleton2();
                }
            }
        }

        return singleton2;
    }
}
