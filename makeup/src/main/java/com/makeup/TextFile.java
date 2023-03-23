package com.makeup;

import lombok.NoArgsConstructor;

@NoArgsConstructor
public class TextFile extends File {
    public TextFile(String name) {
        super(name);
    }

    @Override
    public void display() {
        System.out.println("文本文件：" + super.getName());
    }
}
