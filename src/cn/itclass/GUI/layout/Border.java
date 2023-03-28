package cn.itclass.GUI.layout;

import javax.swing.*;
import java.awt.*;

public class Border extends JFrame {
    JButton nButton = new JButton("North");
    JButton sButton = new JButton("South");
    JButton eButton = new JButton("East");
    JButton wButton = new JButton("West");
    JButton cButton = new JButton("Center");
    public Border(){
        super("Border");
        setSize(480,360);
        setLayout(new BorderLayout());
        add(nButton, BorderLayout.NORTH);
        add(sButton, BorderLayout.SOUTH);
        add(eButton, BorderLayout.EAST);
        add(wButton, BorderLayout.WEST);
        add(cButton, BorderLayout.CENTER);
        setVisible(true);
    }

    public static void main(String[] args) {
        Border bl = new Border();
    }
}
