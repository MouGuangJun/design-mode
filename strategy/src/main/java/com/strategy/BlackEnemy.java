package com.strategy;

//孙夫人断后，挡住追兵
public class BlackEnemy implements Strategy {
    @Override
    public void operate() {
        System.out.println("孙夫人断后，挡住追兵！");
    }
}