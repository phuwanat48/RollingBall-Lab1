package Lib;

import java.awt.*;
import javax.swing.*;

public class RollingBall extends JPanel {

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        // วาดครึ่งวงกลมสีดำ
        g.fillArc(100, 90, 80, 80, 0, 180);

        // วาดเส้นขอบวงกลม

        g.drawOval(100, 90, 80, 80);

    }
}