package com.abstract_factory.factory;

import com.abstract_factory.cpu.CPU;
import com.abstract_factory.cpu.MacCPU;
import com.abstract_factory.ram.MacRAM;
import com.abstract_factory.ram.RAM;

public class MacFactory implements Factory {
    public CPU produceCPU() {
        return new MacCPU();
    }

    public RAM produceRAM() {
        return new MacRAM();
    }
}
