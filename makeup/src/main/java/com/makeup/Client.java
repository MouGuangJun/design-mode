package com.makeup;

public class Client {

    public static void main(String[] args) {
        /**
         * 我们先建立一个这样的文件系统
         *                  总文件
         *
         *   a.txt    b.jpg                   c文件夹
         *                      c_1.text  c_1.rmvb    c_1.jpg
         */
        // 向总文件夹中放入三个文件：1.txt、2.jpg、1文件夹
        Folder folder = new Folder("总文件");
        TextFile a_txt = new TextFile("a.txt");
        ImageFile b_jpg = new ImageFile("b.jpg");

        // 向C文件夹中添加文件：c_1.txt、c_1.rmvb、c_1.jpg
        Folder c_folder = new Folder("c文件夹");
        TextFile c_1_txt = new TextFile("c_1.txt");
        VideoFile c_1_video = new VideoFile("c_1.rmvb");
        ImageFile c_1_jpg = new ImageFile("c_1.jpg");
        c_folder.add(c_1_txt);
        c_folder.add(c_1_video);
        c_folder.add(c_1_jpg);
        folder.add(a_txt);
        folder.add(b_jpg);
        folder.add(c_folder);

        // 遍历总文件夹
        folder.display();

        // 将c_1.txt删除
        System.out.println("-----------------------");
        c_folder.remove(c_1_txt);
        c_folder.display();

    }
}
