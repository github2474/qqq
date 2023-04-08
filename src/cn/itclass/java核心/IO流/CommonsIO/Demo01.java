package cn.itclass.java核心.IO流.CommonsIO;

import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;

public class Demo01 {
    public static void main(String[] args) throws IOException {
        File src = new File("daily");
        File dest = new File("zip");
        FileUtils.cleanDirectory(dest);
    }
}
