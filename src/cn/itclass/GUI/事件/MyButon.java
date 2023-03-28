package cn.itclass.GUI.事件;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MyButon {
    public static void main(String[] args) {
        MyButtonFrame frm = new MyButtonFrame();
        frm.setVisible(true);
    }
}
class MyButtonFrame extends JFrame{
    public MyButtonFrame(){
        super("测试按钮事件");
        setSize(300,200);
        MyButtonPanel panel = new MyButtonPanel();
        add(panel);
    }
}
class MyButtonPanel extends JPanel {
    public MyButtonPanel() {
        JButton bButton = new JButton("蓝色");
        JButton gButton = new JButton("绿色");
        JButton eButton = new JButton("退出");

        add(bButton);
        add(gButton);
        add(eButton);
        //创建监听对象
        MyListenerAction bAction = new MyListenerAction(Color.BLUE);
        MyListenerAction gAction = new MyListenerAction(Color.GREEN);
        MyListenerAction eAction = new MyListenerAction(Color.RED);

        //监听对象添加至按钮
        bButton.addActionListener(bAction);
        gButton.addActionListener(gAction);
        eButton.addActionListener(eAction);
    }


    public class MyListenerAction implements ActionListener {
        private Color bgColor;

        public MyListenerAction(Color c) {
            bgColor = c;
        }

        @Override
        public void actionPerformed(ActionEvent event) {
            setBackground(bgColor);
            repaint();
            if (event.getActionCommand().equals("退出")) {
                System.exit(0);
            }
        }
    }
}