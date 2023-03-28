package cn.itclass.Applect;
import java.applet.*;
import java.awt.*;

public class FirstApplet extends Applet {
    public void init() {
        Label helloLabel = new Label("Hello World!");
        add(helloLabel);
    }
}