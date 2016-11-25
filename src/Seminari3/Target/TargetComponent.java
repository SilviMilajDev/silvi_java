package Seminari3.Target;

import javax.swing.*;
import java.awt.*;
import java.awt.geom.Ellipse2D;

class TargetComponent extends JComponent
{
    private Graphics2D g2;
    private int i;

    public void paintComponent(Graphics g) {
        g2 = (Graphics2D) g;

        Ellipse2D.Double circle;

        for (i = 5; i > 0; i--) {
            circle = new Ellipse2D.Double(10 + 25*(5-i), 10 + 25*(5-i), 50*i, 50*i);
            determineColor();
            g2.fill(circle);
        }
    }

    private void determineColor() {
        g2.setColor((i%2 == 1)? Color.RED : Color.WHITE);
    }
}
