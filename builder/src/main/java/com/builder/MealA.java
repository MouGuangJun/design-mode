package com.builder;

public class MealA extends MealBuilder {
    public void buildFood() {
        meal.setFood("一盒薯条");
    }

    public void buildDrink() {
        meal.setDrink("一杯可乐");
    }
}
