package cn.itclass.java核心.IO流.字符缓冲流;

import java.io.*;

public class BufferedReaderDemo {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("a.txt"));
        BufferedWriter bw = new BufferedWriter(new FileWriter("b.txt",true));

        String line1 ;
        while((line1=br.readLine())!=null){
            bw.write(line1);
            bw.newLine();
        }
        bw.close();
        br.close();
    }
}
