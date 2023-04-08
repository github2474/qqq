package cn.itclass.GUI.Menu;
import javax.swing.*;

public class MenuBar01 extends JApplet {
    public static void main(String[] args) {
        JFrame frame  = new JFrame("new");
        MenuBar01 menuBar01 = new MenuBar01();
        frame.getContentPane().add("Center",menuBar01);
        frame.setSize(300,200);
        frame.setVisible(true);

    }
    public void init(){
        JMenuBar myMenu = new JMenuBar();
        JMenu[] menus = {new JMenu("File"),new JMenu("Edit"),new JMenu("Help")};
        for(int i =0 ;i<menus.length;i++){
            myMenu.add(menus[i]);
        }
        menus[0].setMnemonic('F');
        JMenuItem[] fileMemuItems ={new JMenuItem("New"),new JMenuItem("Open"),new JMenuItem("Save")};
        JMenuItem[] editMemuItems ={new JMenuItem("Undo"),new JMenuItem("Copy")};
        for(int i=0;i<fileMemuItems.length;i++){
            menus[0].add(fileMemuItems[i]);
        }
        fileMemuItems[0].setMnemonic('N');
        for(int i=0;i<editMemuItems.length;i++){
            menus[1].add(editMemuItems[i]);
        }
        setJMenuBar(myMenu);
    }
}
