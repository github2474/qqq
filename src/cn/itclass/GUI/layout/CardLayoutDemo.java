package cn.itclass.GUI.layout;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class CardLayoutDemo implements ActionListener {
    private Panel p1,p2,p3;
    private Button b1,b2,b3;
    private  Frame f;
    private CardLayout Clayout = new CardLayout();
    public void create(){
        b1 = new Button("第一个");
        b2 = new Button("第二个");
        b3 = new Button("第三个");
        p1 = new Panel();
        p2 = new Panel();
        p3 = new Panel();
        f = new Frame("test CardLayout");
        p1.add(b1);
        p1.setBackground(Color.RED);
        b1.addActionListener(this);
        p2.add(b2);
        p2.setBackground(Color.BLUE);
        b2.addActionListener(this);
        p3.add(b3);
        p3.setBackground(Color.GREEN);
        b3.addActionListener(this);
        f.setLayout(Clayout);
        f.add(p1,"卡片一");
        f.add(p1,"卡片二");
        f.add(p1,"卡片三");
        f.setSize(200,200);
        f.setVisible(true);
    }

    public static void main(String[] args) {
        CardLayoutDemo cl = new CardLayoutDemo();
        cl.create();
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        Clayout.next(f);
    }

}

