package Seminari8.Tree;

import javax.swing.*;
import java.awt.*;

class TreeComponent extends JComponent {

    private int n;

    TreeComponent(int n) {
        this.n = n;
    }

    public void paintComponent(Graphics g){
        Graphics2D g2 = (Graphics2D) g;

        int rectangle_height = 500 / this.n;
        int rectangle_min_width = 500 / this.n;

        Rectangle rectangle;

        for (int i = 1; i <= this.n; i++) {
            int x = 300 - (rectangle_min_width * i) / 2;
            int y = (i - 1) * rectangle_height + 25;
            int width = rectangle_min_width * i;

            rectangle = new Rectangle(x, y, width, rectangle_height);

            g2.setColor(
                (i % 2 == 0)
                    ? Color.BLUE
                    : Color.GREEN
            );

            g2.fill(rectangle);
        }

    }
}
