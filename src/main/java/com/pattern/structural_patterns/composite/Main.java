package com.pattern.structural_patterns.composite;

/**
 * 测试类
 *
 * @author: Chestnut
 * @since: 2023-06-30
 **/
public class Main {
    public static void main(String[] args) {
        Folder f1 = new Folder("MyFolder");
        AbstractFile f2 = new ImageFile("imageFile.jpg");
        AbstractFile f3 = new TextFile("textFile.txt");
        f1.add(f2);
        f1.add(f3);

        Folder f11 = new Folder("Movies");
        AbstractFile f4 = new VideoFile("盗梦空间.avi");
        AbstractFile f5 = new VideoFile("星际穿越.avi");
        f11.add(f4);
        f11.add(f5);

        f1.add(f11);
        f1.killVirus();

    }
}

/*
文件夹文件MyFolder查杀！
图像文件imageFile.jpg查杀！
文本文件textFile.txt查杀！
文件夹文件Movies查杀！
视频文件盗梦空间.avi查杀！
视频文件星际穿越.avi查杀！
 */
