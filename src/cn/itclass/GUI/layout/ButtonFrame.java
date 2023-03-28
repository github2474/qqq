package cn.itclass.GUI.layout;
import java.awt.*;
import javax.swing.*;
public class ButtonFrame extends JFrame{
    JButton load = new JButton("load");
    JButton save = new JButton("Save");
    JButton unsubscribe = new JButton("unsubscribe");
    public ButtonFrame(){
        super("ButtonFrame");
        setSize(180,200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container container = getContentPane();
        container.setLayout(new FlowLayout());
        container.add(load);
        container.add(save);
        container.add(unsubscribe);
        setVisible(true);
    }

    public static void main(String[] args) {
        ButtonFrame bf = new ButtonFrame();
    }
}
