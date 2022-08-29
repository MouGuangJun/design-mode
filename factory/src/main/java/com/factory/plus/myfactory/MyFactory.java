package com.factory.plus.myfactory;

import com.factory.plus.EmptyService;
import com.factory.plus.LogicFactory;

public class MyFactory extends LogicFactory {
    static {
        attributes.put("1", new EmptyService());
        attributes.put("2", new MyService());
        init(MyFactory.class);
    }
}
