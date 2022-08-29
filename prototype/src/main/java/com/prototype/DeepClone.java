package com.prototype;

import java.util.ArrayList;

public class DeepClone extends Prototype {
    @Override
    public Object clone() throws CloneNotSupportedException {
        Prototype prototype = (Prototype) super.clone();
        // 拷贝非基础类型数据
        prototype.list = (ArrayList<String>) this.list.clone();
        return prototype;
    }

    @Override
    public void show() {
        System.out.println("深克隆");
    }
}
