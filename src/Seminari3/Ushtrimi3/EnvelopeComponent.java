package Seminari3.Ushtrimi3;

import javax.swing.*;
import java.awt.*;
import java.awt.geom.Line2D;

class EnvelopeComponent extends JComponent
{
    protected void paintComponent(Graphics g) {
        Graphics2D g2 = (Graphics2D) g;

        Rectangle envelope = new Rectangle(10, 10, 300, 200);
        g2.setColor(Color.WHITE);
        g2.fill(envelope);

        g2.setColor(Color.BLACK);
        g2.draw(envelope);

        Line2D.Double line = new Line2D.Double(10, 10, 150, 90);
        g2.draw(line);

        line = new Line2D.Double(150, 90, 310, 10);
        g2.draw(line);
    }
}
