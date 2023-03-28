package cn.itclass.GUI.layout;

import javax.swing.*;
import java.awt.*;

public class GridLayoutDemo extends JFrame{
    public GridLayoutDemo(String s){
        super(s);
        JButton btn[];
        String str[]={"1","2","3","4","5","6","7","8","9"};
        setLayout(new GridLayout(3,3,10,10));
        btn=new JButton[str.length];
        for(int i=0;i<str.length;i++){
            btn[i]= new JButton(str[i]);
            add(btn[i]);
        }
    }

    public static void main(String[] args) {
        GridLayoutDemo gl = new GridLayoutDemo("网格布局演示");
        gl.setSize(300,300);
        gl.setVisible(true);
    }
}
