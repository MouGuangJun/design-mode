package com.proxy.gift;

// 她闺蜜室友
public class HerChum implements GiveGift {
    private You you;

    public HerChum(You you) {
        this.you = you;
    }

    public void giveFlowers() {
        you.giveFlowers();
        System.out.println("分我一朵先！");
    }

    public void giveChocolate() {
        you.giveChocolate();
        System.out.println("巧克力？拿来吧你！");
    }

    public void giveBook() {
        you.giveBook();
        System.out.println("学习？学个屁！");
    }
}
