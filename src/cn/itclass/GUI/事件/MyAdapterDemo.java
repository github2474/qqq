package cn.itclass.GUI.事件;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MyAdapterDemo {
    public static void main(String[] args) {
        MyFrame fm = new MyFrame();
        fm.setVisible(true);
    }
}
class MyFrame extends JFrame{
    boolean w;

    public MyFrame() {
        this.w = false;
        setTitle("测试适配器类");
        setSize(300,200);
        MyPannel pannel = new MyPannel();
        add(pannel);
        addWindowFocusListener(new MyWindowAdapter());
    }
    private class MyWindowAdapter extends WindowAdapter{
        public void windowClosing(WindowEvent we){
            if(w)
                dispose();
            else
                System.exit(0);
        }
    }
}
class MyPannel extends Panel{
    public MyPannel(){
        Button bButton = new Button("蓝色");
        add(bButton);

        MyMouseAdapter bAction = new MyMouseAdapter(Color.BLUE);
        MyMouseMotionAdapter rAction = new MyMouseMotionAdapter(Color.red);

        bButton.addMouseListener(bAction);
        addMouseMotionListener(rAction);
        }
    private class MyMouseAdapter extends MouseAdapter{
        private Color bgColor;
        public MyMouseAdapter(Color c){
            bgColor=c;
        }
        public void mouseClicked(MouseEvent mevent){
            setBackground(bgColor);
            repaint();
        }
    }
    private class MyMouseMotionAdapter extends MouseMotionAdapter{
        private Color bgColor;
        public MyMouseMotionAdapter(Color c){
            bgColor = c;
        }
        public void mouseMoved(MouseEvent mevent){
            setBackground(bgColor);
            repaint();
        }
    }
}