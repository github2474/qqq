package cn.itclass.Applect;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;

public class SimplePaint extends JFrame implements ActionListener, MouseListener, MouseMotionListener {
    private ArrayList<Point> points;
    private Point prevPoint;
    private boolean isDrawing;
    private JButton clearButton;
    private Graphics2D g2d;

    public SimplePaint() {
        super();
        setTitle("简单画板");
        setSize(800, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // 创建画布对象
        DrawCanvas canvas = new DrawCanvas();
        add(canvas, BorderLayout.CENTER);
        // 创建控制面板
        JPanel controlPanel = new JPanel();
        // 创建清空按钮
        clearButton = new JButton("清空画板");
        clearButton.addActionListener(this);
        controlPanel.add(clearButton);
        // 将控制面板添加到主界面中
        add(controlPanel, BorderLayout.NORTH);
        // 注册鼠标监听器
        addMouseListener(this);
        addMouseMotionListener(this);
        // 初始化点列表
        points = new ArrayList<Point>();
        // 显示主界面
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == clearButton) {
            points.clear();
            repaint();
        }
    }

    public void mousePressed(MouseEvent e) {
        if (SwingUtilities.isLeftMouseButton(e)) {
            isDrawing = true;
            prevPoint = e.getPoint();
        }
    }

    public void mouseReleased(MouseEvent e) {
        if (SwingUtilities.isLeftMouseButton(e)) {
            isDrawing = false;
            prevPoint = null;
        }
    }

    public void mouseMoved(MouseEvent e) {}

    public void mouseEntered(MouseEvent e) {}

    public void mouseExited(MouseEvent e) {}

    public void mouseClicked(MouseEvent e) {}

    public void mouseDragged(MouseEvent e) {
        if (isDrawing && SwingUtilities.isLeftMouseButton(e)) {
            Point currPoint = e.getPoint();
            Graphics2D g2 = getGraphics2D();
            g2.setColor(Color.BLACK);
            g2.drawLine(prevPoint.x, prevPoint.y, currPoint.x, currPoint.y);
            prevPoint = currPoint;
        }
    }

    class DrawCanvas extends JPanel {
        @Override
        public void paint(Graphics g) {
            super.paint(g);
            for (Point p : points) {
                g.fillRect(p.x - 2, p.y - 2, 5, 5);
            }
        }
    }

    private Graphics2D getGraphics2D() {
        Graphics2D g2d = (Graphics2D) getGraphics();
        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        g2d.setStroke(new BasicStroke(5, BasicStroke.CAP_ROUND, BasicStroke.JOIN_ROUND));
        return g2d;
    }

    public static void main(String[] args) {
        new SimplePaint();
    }
}