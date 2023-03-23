package com.makeup;

import lombok.NoArgsConstructor;

@NoArgsConstructor
public class VideoFile extends File {
    public VideoFile(String name) {
        super(name);
    }

    @Override
    public void display() {
        System.out.println("影像文件：" + super.getName());
    }
}
