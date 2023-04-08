package cn.itclass.java核心.IO流;

import cn.hutool.core.io.FileUtil;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class HuTool {
    public static void main(String[] args) {
        File file = FileUtil.file("D:\\", "aaa", "aaa.txt");
        File file1 = FileUtil.touch(file);
        System.out.println(file1);
        ArrayList<String> list = new ArrayList<>();
        list.add("aaa");
        list.add("aaa");
        list.add("aaa");

        //FileUtil.writeLines(list,"D:\\a.txt","UTF-8",true);
        //FileUtil.appendLines(list,"D:\\a.txt","UTF-8");
        List<String> strings = FileUtil.readLines("D:\\a.txt", "UTF-8");
        System.out.println(strings);
    }
}
