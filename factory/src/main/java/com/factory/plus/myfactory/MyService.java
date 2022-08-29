package com.factory.plus.myfactory;

import com.factory.plus.LogicService;

@SuppressWarnings("unchecked")
public class MyService implements LogicService.DefaultLogicService {
    @Override
    public <E, T> T execute(E... e) {
        return (T) "my";
    }
}
