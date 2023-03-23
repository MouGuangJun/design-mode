package com.flyweight;

import lombok.NoArgsConstructor;

/**
 * 都是同一个圆（内部状态）
 */
@NoArgsConstructor
public class Circle extends Shape {
    private String color;// 不同的颜色（外部状态）

    public Circle(String color) {
        this.color = color;
    }


    @Override
    public void draw() {
        System.out.println("画了一个" + color + "的圆形！");
    }
}
