package com.factory.plus;

/**
 * 空的LogicService实现方法，表示这个条件对应什么逻辑都没有执行
 */
@SuppressWarnings("unchecked")
public class EmptyService implements LogicService.DefaultLogicService {

    @Override
    public <E, T> T execute(E... e) {
        return null;
    }
}
