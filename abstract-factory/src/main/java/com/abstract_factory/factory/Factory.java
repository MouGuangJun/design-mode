package com.abstract_factory.factory;

import com.abstract_factory.cpu.CPU;
import com.abstract_factory.ram.RAM;

public interface Factory {
    CPU produceCPU();

    RAM produceRAM();
}
