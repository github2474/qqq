package cn.itclass.GUI.layout;

import javax.swing.*;
import java.awt.*;

public class JCheckFrame extends JFrame {
    JCheckBox[] team = new JCheckBox[4];
    public JCheckFrame() {
        super("box");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        team[0] = new JCheckBox("Atom");
        team[1] = new JCheckBox("RSS 0.92");
        team[2] = new JCheckBox("RSS 1.0");
        team[3] = new JCheckBox("RSS 2.0",true);
        Container container = getContentPane();
        container.setLayout(new FlowLayout());
        JLabel chooseLabel = new JLabel("choose an output format");
        container.add(chooseLabel);
        ButtonGroup group = new ButtonGroup();
        for(int i=0;i<2;i++){
            group.add(team[i]);
            container.add(team[i]);
        }
        for(int i=2;i<team.length;i++){
            container.add(team[i]);
        }
        setSize(200,170);
        setVisible(true);

    }

    public static void main(String[] args) {
        JCheckFrame jf = new JCheckFrame();
    }

}
