package Seminari16.Ushtrimi3;

import javax.swing.*;
import java.awt.*;
import java.awt.geom.Ellipse2D;

public class Circle extends JComponent {
    private Ellipse2D.Double rreth = new Ellipse2D.Double(135 , 125, 200, 200);

    public void paintComponent(Graphics g) {
        Graphics2D g2 = (Graphics2D) g;

        g2.draw(rreth);
    }

    public void paintWithDiameter(int diameter) {
        int x = 235 - diameter / 2;
        int y = 225 - diameter / 2;

        rreth = new Ellipse2D.Double(x, y, diameter, diameter);
        repaint();
    }
}
