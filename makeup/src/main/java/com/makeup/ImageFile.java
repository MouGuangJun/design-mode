package com.makeup;

import lombok.NoArgsConstructor;

@NoArgsConstructor
public class ImageFile extends File {
    public ImageFile(String name) {
        super(name);
    }

    @Override
    public void display() {
        System.out.println("图像文件：" + super.getName());
    }
}
