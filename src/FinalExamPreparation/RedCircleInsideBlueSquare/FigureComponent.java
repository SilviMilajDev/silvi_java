package FinalExamPreparation.RedCircleInsideBlueSquare;

import javax.swing.*;
import java.awt.*;
import java.awt.geom.Ellipse2D;

public class FigureComponent extends JComponent {
    public void paintComponent(Graphics g) {
        Graphics2D g2 = (Graphics2D) g;

        Rectangle square = new Rectangle(20, 20, 100, 100);

        g2.setColor(Color.BLUE);
        g2.fill(square);

        Ellipse2D.Double circle = new Ellipse2D.Double(20, 20, 100, 100);

        g2.setColor(Color.RED);
        g2.fill(circle);
    }
}
