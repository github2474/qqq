package cn.itclass.GUI.layout;
import javax.swing.JFrame;
public class SimpleFrame extends JFrame{
    public SimpleFrame(){
        super("SimpleFrame");
        setSize(300,100);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String[] args) {
        SimpleFrame sf = new SimpleFrame();
    }
}
