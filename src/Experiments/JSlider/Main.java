package Experiments.JSlider;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.*;

public class Main {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setSize(400, 500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new BorderLayout());
        frame.getContentPane().setBackground(new Color(100,100,100));

        JPanel sliders = new JPanel(new GridLayout(3, 1));

        JSlider red = new JSlider(0, 255, 100);
        JSlider green = new JSlider(0, 255, 100);
        JSlider blue = new JSlider(0, 255, 100);

        class SliderStateChangeListener implements ChangeListener {
            public void stateChanged(ChangeEvent e) {
                Color color = new Color(red.getValue(), green.getValue(), blue.getValue());
                frame.getContentPane().setBackground(color);
            }
        }

        SliderStateChangeListener listener = new SliderStateChangeListener();

        red.addChangeListener(listener);
        green.addChangeListener(listener);
        blue.addChangeListener(listener);

        sliders.add(red);
        sliders.add(green);
        sliders.add(blue);

        frame.add(sliders, BorderLayout.SOUTH);

        frame.setVisible(true);
    }
}
