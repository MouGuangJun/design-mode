package com.singleton;

import java.util.HashMap;
import java.util.Map;

// 类似Spring里面的方法，将类名注册，下次从里面直接获取。
public class Singleton5 {
    private static Map<String, Singleton5> map = new HashMap<String, Singleton5>();

    static {
        Singleton5 singleton5 = new Singleton5();
        map.put(singleton5.getClass().getName(), singleton5);
    }


    //保护的默认构造子
    protected Singleton5() {
    }

    // 静态工厂方法,返还此类惟一的实例
    public static Singleton5 getInstance(Class<?> clazz) {
        String name;
        if (clazz == null) {
            name = Singleton5.class.getName();
            clazz = Singleton5.class;
        } else {
            name = clazz.getName();
        }

        if (map.get(name) == null) {
            try {
                map.put(name, (Singleton5) clazz.newInstance());
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        return map.get(name);
    }

    //一个示意性的商业方法
    public String about() {
        return "Hello, I am RegSingleton.";
    }
}
