package com.proxy.gift;

// 你小子
public class You implements GiveGift {
    private BeautifulGirl mm;

    public You(BeautifulGirl mm) {
        this.mm = mm;
    }

    public void giveBook() {
        System.out.println(mm.getName() + ",送你一本书....");
    }

    public void giveChocolate() {
        System.out.println(mm.getName() + ",送你一盒巧克力....");
    }

    public void giveFlowers() {
        System.out.println(mm.getName() + ",送你一束花....");
    }
}
