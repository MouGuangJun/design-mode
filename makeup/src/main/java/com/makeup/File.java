package com.makeup;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public abstract class File {
    private String name;

    public File(String name) {
        this.name = name;
    }

    public abstract void display();
}
