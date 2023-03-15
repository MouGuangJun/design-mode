package com.chain.product;

import java.util.ArrayList;
import java.util.List;

public class ProcessorChain {

    // 保存处理节点
    private final List<Processor> processorList = new ArrayList<>();

    // 处理节点下标
    private int index = 0;

    // 动态扩展处理节点
    public void addProcessor(Processor processor) {
        processorList.add(processor);
    }

    // 获取处理器处理
    public boolean process(Product product, ProcessorChain chain) {
        if (index == processorList.size()) {
            return true;
        }
        Processor processor = processorList.get(index);
        index++;
        return processor.process(product, chain);
    }

}