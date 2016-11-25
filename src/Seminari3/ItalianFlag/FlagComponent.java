package Seminari3.ItalianFlag;

import javax.swing.*;
import java.awt.*;

class FlagComponent extends JComponent {
    public void paintComponent(Graphics g) {
        Graphics2D g2 = (Graphics2D) g;

        Rectangle part = new Rectangle(10, 10, 100, 200);
        g2.setColor(Color.GREEN);
        g2.fill(part);

        part = new Rectangle(101, 10, 100, 200);
        g2.setColor(Color.WHITE);
        g2.fill(part);

        part = new Rectangle(201, 10, 100, 200);
        g2.setColor(Color.RED);
        g2.fill(part);
    }
}
