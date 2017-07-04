package FinalExamPreparation.RedCircleInsideBlueSquare;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(200, 200);

        frame.add(new FigureComponent());

        frame.setVisible(true);
    }
}
