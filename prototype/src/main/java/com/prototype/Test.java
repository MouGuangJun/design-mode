package com.prototype;

public class Test {
    public static void main(String[] args) throws CloneNotSupportedException {
        ShallowClone cp = new ShallowClone();
        ShallowClone clonecp = (ShallowClone) cp.clone();
        clonecp.show();
        // true 还是引用的同一个地址
        System.out.println(clonecp.list == cp.list);

        DeepClone cp2 = new DeepClone();
        DeepClone clonecp2 = (DeepClone) cp2.clone();
        clonecp2.show();
        // false 不是相同的内存地址，已经完成了copy的操作
        System.out.println(clonecp2.list == cp2.list);
    }
}
