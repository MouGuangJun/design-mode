package com.strategy;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Context {
    private Strategy strategy;

    public void operate() {
        strategy.operate();
    }
}


