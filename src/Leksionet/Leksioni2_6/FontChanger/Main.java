package Leksionet.Leksioni2_6.FontChanger;

import javax.swing.*;
import javax.swing.border.EtchedBorder;
import javax.swing.border.TitledBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main
{
    private static String selected_font = "Serif";
    private static int selected_style = Font.PLAIN;
    private static int selected_size = 16;

    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setLayout(new BorderLayout());
        frame.setSize(400, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel message_panel = new JPanel(new BorderLayout());
        JLabel message_label = new JLabel("Big Java");
        message_label.setFont( new Font(selected_font, selected_style, selected_size) );
        message_panel.add(message_label, BorderLayout.CENTER);

        JPanel functionality_panel = new JPanel();

        JComboBox<String> font = new JComboBox<>();
        font.addItem("Serif");
        font.addItem("SansSerif");
        font.addItem("Monospaced");
        font.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                selected_font = (String) font.getSelectedItem();
                message_label.setFont( new Font(selected_font, selected_style, selected_size) );
            }
        });

        JPanel size_panel = new JPanel();
        size_panel.setBorder(new TitledBorder(new EtchedBorder(), "Style"));

        ButtonGroup radio_group = new ButtonGroup();
        class SizingListener implements ActionListener {
            private int n;

            SizingListener(int n) {
                this.n = n;
            }

            public void actionPerformed(ActionEvent e) {
                selected_size = n;
                message_label.setFont( new Font(selected_font, selected_style, selected_size) );
            }
        }

        JRadioButton size_small = new JRadioButton("Small");
        size_small.setSelected(true);
        size_small.addActionListener(new SizingListener(16));

        JRadioButton size_medium = new JRadioButton("Medium");
        size_medium.addActionListener(new SizingListener(34));

        JRadioButton size_large = new JRadioButton("Large");
        size_large.addActionListener(new SizingListener(76));

        radio_group.add(size_small);
        radio_group.add(size_medium);
        radio_group.add(size_large);

        size_panel.add(size_small);
        size_panel.add(size_medium);
        size_panel.add(size_large);

        JPanel style_panel = new JPanel();
        style_panel.setBorder(new TitledBorder(new EtchedBorder(), "Size"));

        JCheckBox checkbox_italic = new JCheckBox("Italic");
        JCheckBox checkbox_bold = new JCheckBox("Bold");

        class CheckboxChangeListener implements ActionListener {
            public void actionPerformed(ActionEvent e) {
                if (checkbox_italic.isSelected() && checkbox_bold.isSelected()) {
                    selected_style = Font.BOLD + Font.ITALIC;
                } else if (checkbox_italic.isSelected()) {
                    selected_style = Font.ITALIC;
                } else if (checkbox_bold.isSelected()) {
                    selected_style = Font.BOLD;
                } else {
                    selected_style = Font.PLAIN;
                }
                message_label.setFont( new Font(selected_font, selected_style, selected_size) );
            }
        }

        checkbox_italic.addActionListener(new CheckboxChangeListener());
        checkbox_bold.addActionListener(new CheckboxChangeListener());

        style_panel.add(checkbox_italic);
        style_panel.add(checkbox_bold);

        functionality_panel.add(font);
        functionality_panel.add(size_panel);
        functionality_panel.add(style_panel);

        frame.add(message_panel, BorderLayout.NORTH);
        frame.add(functionality_panel, BorderLayout.CENTER);

        frame.setVisible(true);
    }
}
