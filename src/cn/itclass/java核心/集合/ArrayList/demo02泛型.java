package cn.itclass.java核心.集合.ArrayList;

import java.util.ArrayList;
import java.util.Iterator;

public class demo02泛型 {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("222");
        arrayList.add("ddd");
        arrayList.add("ssss");
        for (String s:arrayList
             ) {
            System.out.println(s);
        }
        Iterator<String> it = arrayList.iterator();
        while (it.hasNext()) {
            String s = it.next();
            System.out.println(s);
        }
    }
}
