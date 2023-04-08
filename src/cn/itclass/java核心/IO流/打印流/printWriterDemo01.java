package cn.itclass.java核心.IO流.打印流;


import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class printWriterDemo01 {
    public static void main(String[] args) throws IOException {
        PrintWriter pw = new PrintWriter(new FileWriter("a.txt"),true);
        pw.println("烦烦烦烦烦烦烦烦烦");
        pw.print("烦烦烦烦烦烦烦烦烦");
        pw.printf("%s烦烦烦烦烦烦烦烦烦%s","a","b");
        pw.close();
    }
}
