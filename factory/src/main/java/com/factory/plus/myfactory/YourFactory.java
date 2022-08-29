package com.factory.plus.myfactory;

import com.factory.plus.EmptyService;
import com.factory.plus.LogicFactory;

public class YourFactory extends LogicFactory {
    static {
        attributes.put("1", new EmptyService());
        attributes.put("2", new YourService());
        init(YourFactory.class);
    }
}
