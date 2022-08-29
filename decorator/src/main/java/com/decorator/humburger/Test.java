package com.decorator.humburger;

public class Test {

    public static void main(String[] args) {
        // 普通的汉堡
        Humburger humburger = new ChickenBurger();
        System.out.println(humburger.getName() + "  价钱：" + humburger.getPrice());

        // 加生菜
        Lettuce lettuce = new Lettuce(humburger);
        System.out.println(lettuce.getName() + "  价钱：" + lettuce.getPrice());

        // 加辣椒
        Chilli chilli = new Chilli(humburger);
        System.out.println(chilli.getName() + "  价钱：" + chilli.getPrice());

        // 先加生菜再加辣椒
        Chilli chilli1 = new Chilli(lettuce);
        System.out.println(chilli1.getName() + "  价钱：" + chilli1.getPrice());
    }
}
