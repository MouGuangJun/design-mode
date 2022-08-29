package com.factory.plus;

/**
 * 公共逻辑接口
 */
@SuppressWarnings("unchecked")
public interface LogicService {

    /**
     * 获取执行结果（必须是{@link DefaultLogicService}的实现类，否则会报类型转换异常）
     *
     * @param initialValue 初始化值
     * @param t            传入参数
     * @param <T>          返回值类型
     * @param <R>          参数类型
     * @return 执行结果
     */
    default <T, R> R getResultValue(R initialValue, T... t) {
        if (this instanceof EmptyService) {
            return initialValue;
        }

        return ((DefaultLogicService) this).execute(t);
    }

    /**
     * 默认的公共逻辑接口（支持任意类型、格式的参数，任意类型的返回值）
     */
    interface DefaultLogicService extends LogicService {
        <T, R> R execute(T... t);
    }
}
