package com.factory.plus.myfactory;

public class Test {
    public static void main(String[] args) {
        String myValue = new MyFactory().getLogicService("2").getResultValue("默认值");
        System.out.println(myValue);

        String yourValue = new YourFactory().getLogicService("2").getResultValue("默认值");
        System.out.println(yourValue);
    }
}
