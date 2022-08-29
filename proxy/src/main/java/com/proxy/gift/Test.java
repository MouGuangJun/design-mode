package com.proxy.gift;

public class Test {
    public static void main(String[] args) {
        BeautifulGirl beautifulGirl = new BeautifulGirl("漂亮妹妹");
        HerChum herChum = new HerChum(new You(beautifulGirl));
        herChum.giveFlowers();
        herChum.giveChocolate();
        herChum.giveBook();
    }
}
