package com.observer;

/**
 * 主题接口
 */
public interface Subject {
    /**
     * 注册观察者
     */
    public void registerObserver(Observer observer);

    /**
     * 删除观察者
     */
    public void removeOberver(Observer observer);

    /**
     * 当主题状态发生改变时，这个方法需要被调用，以通知所有观察者
     */
    public void notifyObserver();
}