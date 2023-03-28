package cn.itclass.GUI.layout;
import javax.swing.*;
import java.awt.*;

public class LabelTest extends JFrame {
    public static void main(String[] args) {
        LabelTest test = new LabelTest();
    }
    public LabelTest(){
        super("testLabel");
        String[] s ={"Label1","Label2","Label3"};
        Container container = getContentPane();
        container.setLayout(new FlowLayout(FlowLayout.LEFT));
        for(int i=0;i<3;i++){
            JLabel alable = new JLabel(s[i]);
            container.add(alable);
        }
        setSize(200,170);
        setVisible(true);
    }
}
