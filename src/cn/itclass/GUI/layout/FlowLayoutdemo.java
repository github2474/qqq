package cn.itclass.GUI.layout;

import javax.swing.*;
import java.awt.*;

public class FlowLayoutdemo extends JFrame {
    JButton a = new JButton("Alibi");
    JButton b = new JButton("Burglar");
    JButton c = new JButton("Corpse");
    JButton d = new JButton("Deadbeat");
    public FlowLayoutdemo(){
        super("Alphabet");
        setSize(260,120);
        FlowLayout lm = new FlowLayout(FlowLayout.LEFT);
        JPanel apanel = new JPanel(lm);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.getContentPane().add(apanel);//添加面板

        apanel.add(a);
        apanel.add(b);
        apanel.add(c);
        apanel.add(d);
        setVisible(true);

    }

    public static void main(String[] args) {
        FlowLayoutdemo fl = new FlowLayoutdemo();
    }
}
