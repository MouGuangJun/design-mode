package com.singleton;

public class Singleton3 {
    private Singleton3() {
    }

    public static class LazyHolder {
        private static final Singleton3 INSTANCE = new Singleton3();
    }

    public static Singleton3 getInstance() {
        return LazyHolder.INSTANCE;
    }
}
