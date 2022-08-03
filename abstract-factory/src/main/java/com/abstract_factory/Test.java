package com.abstract_factory;

import com.abstract_factory.cpu.CPU;
import com.abstract_factory.factory.Factory;
import com.abstract_factory.factory.MacFactory;
import com.abstract_factory.factory.PcFactory;
import com.abstract_factory.ram.RAM;

public class Test {
    public static void main(String[] args) {
        Factory macFactory = new MacFactory();
        CPU macCPU = macFactory.produceCPU();
        macCPU.use();
        RAM macRAM = macFactory.produceRAM();
        macRAM.stroe();


        PcFactory pcFactory = new PcFactory();
        CPU pcCPU = pcFactory.produceCPU();
        pcCPU.use();
        RAM pcRAM = pcFactory.produceRAM();
        pcRAM.stroe();
    }
}
