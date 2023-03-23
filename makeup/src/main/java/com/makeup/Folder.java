package com.makeup;

import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@NoArgsConstructor
public class Folder extends File {
    private List<File> files;

    public Folder(String name) {
        super(name);
        files = new ArrayList<>();
    }

    /**
     * 浏览文件夹中的文件
     */
    @Override
    public void display() {
        for (File file : files) {
            file.display();
        }
    }

    /**
     * 想文件夹中添加文件
     *
     * @param file 文件
     */
    public void add(File file) {
        files.add(file);
    }

    /**
     * 从文件夹中删除文件
     *
     * @param file 文件
     */
    public void remove(File file) {
        files.remove(file);
    }
}
