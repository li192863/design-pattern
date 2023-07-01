package com.pattern.structural_patterns.composite;

/**
 * 组合（Composite）
 * *将对象组合成树形结构以表示“部分-整体”的层次结构，使得用户对单个对象和组合对象的使用具有一致性。*
 * * 特点
 *   * 组合模式使得叶子对象和容器对象具有一致性，从而形成统一的树形结构，并用一致的方式去处理它们；
 *   * 使用组合模式时，需要先统一单个节点以及“容器”节点的接口，容器节点可以添加任意个节点，这样就可以构成层级结构。
 * @author: Chestnut
 * @since: 2023-06-30
 **/

/**
 * 抽象组件
 */
public interface AbstractFile {
    /**
     * 杀毒
     */
    void killVirus();
}

/**
 * 叶子组件-图像
 */
class ImageFile implements AbstractFile {
    private String name;

    public ImageFile(String name) {
        this.name = name;
    }

    @Override
    public void killVirus() {
        System.out.println("图像文件" + name + "查杀！");
    }
}

/**
 * 叶子组件-文本
 */
class TextFile implements AbstractFile {
    private String name;

    public TextFile(String name) {
        this.name = name;
    }

    @Override
    public void killVirus() {
        System.out.println("文本文件" + name + "查杀！");
    }
}

/**
 * 叶子组件-视频
 */
class VideoFile implements AbstractFile {
    private String name;

    public VideoFile(String name) {
        this.name = name;
    }

    @Override
    public void killVirus() {
        System.out.println("视频文件" + name + "查杀！");
    }
}
