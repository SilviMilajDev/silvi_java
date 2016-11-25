package Seminari3.Signal;

import javax.swing.*;
import java.awt.*;

class SignalComponent extends JComponent
{
    public void paintComponent(Graphics g) {
        Graphics2D g2 = (Graphics2D) g;

        int i, y, number_of_rectangles = 10;
        int rect_base_width = 30;

        Color filling, border = new Color(40,90,40);

        Rectangle rect;
        for (i = number_of_rectangles; i > 0; i--) {
            y = (number_of_rectangles - i) * 40;
            rect = new Rectangle(10, y, rect_base_width * i, 30);

            filling = new Color(0, (255/number_of_rectangles) * i, 0);

            g2.setColor(filling);
            g2.fill(rect);


            g2.setColor(border);
            g2.draw(rect);
        }
    }
}
