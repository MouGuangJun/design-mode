package com.abstract_factory.factory;

import com.abstract_factory.cpu.CPU;
import com.abstract_factory.cpu.PcCPU;
import com.abstract_factory.ram.PcRAM;
import com.abstract_factory.ram.RAM;

public class PcFactory implements Factory {
    public CPU produceCPU() {
        return new PcCPU();
    }

    public RAM produceRAM() {
        return new PcRAM();
    }
}
