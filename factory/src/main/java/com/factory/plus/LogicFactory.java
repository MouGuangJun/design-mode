package com.factory.plus;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * 公共工厂模式抽象类
 */
public class LogicFactory {
    private static final Set<Factory> factorys = new HashSet<>();//存放所有条件对应执行的逻辑类Set
    protected static final Map<Object, LogicService> attributes = new HashMap<>();// 暂时存放条件和逻辑的映射关系

    /**
     * 获取对应的执行类
     *
     * @param logicType 执行逻辑条件
     * @return 对应的执行类
     */
    public LogicService getLogicService(Object logicType) {
        // 获取对应的工厂执行逻辑映射关系
        Map<Object, LogicService> attributes = factorys.stream().filter(c -> this.getClass().getName().equals(c.getClazzName()))
                .findFirst().orElseGet(Factory::new).getAttributes();
        // 按照条件进行判断，获取对应的执行条件
        if (!attributes.containsKey(logicType)) {
            return new EmptyService();
        }

        return attributes.get(logicType);
    }

    /**
     * 封装工厂子类和执行类的映射关系
     */
    private static class Factory {
        private String clazzName;
        private Map<Object, LogicService> attributes;

        private Factory() {
            this.clazzName = null;
            this.attributes = new HashMap<>();
        }

        /**
         * 有参构造函数
         *
         * @param clazzName  工厂类唯一标识
         * @param attributes 工厂中的所有属性
         */
        private Factory(String clazzName, Map<Object, LogicService> attributes) {
            this.clazzName = clazzName;
            this.attributes = attributes;
        }

        private String getClazzName() {
            return clazzName;
        }

        private Map<Object, LogicService> getAttributes() {
            return attributes;
        }
    }

    /**
     * 将当前类存放的属性集合中
     */
    protected static void init(Class<?> clazz) {
        // 获取调用当前方法的类名
        factorys.add(new Factory(clazz.getName(), attributes));
    }
}
