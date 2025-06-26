package Lib;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class RollingBall extends JPanel implements ActionListener {
    int x = 100;
    int y = 90;
    int start_angle = 0;

    public RollingBall() {
        Timer t = new Timer(100, this);

        t.start();
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        // วาดครึ่งวงกลมสีดำ
        g.fillArc(x, y, 80, 80, start_angle, 180);

        // วาดเส้นขอบวงกลม

        g.drawOval(x, y, 80, 80);

    }

    @Override
    public void actionPerformed(ActionEvent e) {

        x = x - 2;
        start_angle = start_angle + 2;
        if (x == -80)
            x = getWidth();
        if (start_angle == 360)
            start_angle = 0;
        repaint();
    }
}