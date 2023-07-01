package com.pattern.structural_patterns.composite;

import java.util.ArrayList;
import java.util.List;

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
 * 容器组件-文件夹
 */
public class Folder implements AbstractFile {
    private String name;
    /**
     * 定义容器存放容器下子结点
     */
    private List<AbstractFile> list = new ArrayList<>();

    public Folder(String name) {
        this.name = name;
    }

    public void add(AbstractFile file) {
        list.add(file);
    }

    public void remove(AbstractFile file) {
        list.remove(file);
    }

    public AbstractFile getChild(int index) {
        return list.get(index);
    }

    @Override
    public void killVirus() {
        System.out.println("文件夹文件" + name + "查杀！");

        for (AbstractFile file: list) {
            file.killVirus();
        }
    }
}
