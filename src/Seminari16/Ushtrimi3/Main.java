package Seminari16.Ushtrimi3;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.*;

/**
 * Perdorni nje JSlider per te ndryshuar permasat e nje rrethi ne
 * baze te perdoruesit ne JSlider te vendoset vlera e diametrit te rrethit
 * dhe me pas te vizatohet
 */
public class Main {
    public static void main(String[] args)
    {
        JFrame frame = new JFrame();
        frame.setLayout(new BorderLayout());
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 500);

        Circle circle = new Circle();
        frame.add(circle, BorderLayout.CENTER);

        JSlider slider = new JSlider(1, 400);
        slider.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                circle.paintWithDiameter(slider.getValue());
            }
        });

        frame.add(slider, BorderLayout.SOUTH);

        frame.setVisible(true);
    }
}
