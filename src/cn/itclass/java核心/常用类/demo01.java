package cn.itclass.java核心.常用类;

import java.util.Calendar;

public class demo01 {
    public static void main(String[] args) {
        long c1 = Calendar.getInstance().getTimeInMillis();

        String str = new String();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 99999; i++) {
            sb.append(i);
        }
        System.out.println(sb);
        long c2 = Calendar.getInstance().getTimeInMillis();

        System.out.println(c2-c1);
    }
}
