package Leksionet.Leksioni2_9.AddressBook;

import javax.swing.*;
import java.awt.*;
import java.io.EOFException;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class Main {
    final static int NAME_SIZE = 32;
    final static int STREET_SIZE = 32;
    final static int CITY_SIZE = 20;
    final static int STATE_SIZE = 2;
    final static int ZIP_SIZE = 5;
    final static int RECORD_SIZE =
        (NAME_SIZE + STREET_SIZE + CITY_SIZE + STATE_SIZE + ZIP_SIZE);

    private final static String FILE_DESTINATION =
        "src/Leksionet/Leksioni2_9/AddressBook/data.bin";

    private static int record_number = 0;

    private static JTextField name_field;
    private static JTextField street_field;
    private static JTextField state_field;
    private static JTextField city_field;
    private static JTextField zip_field;

    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setSize(500, 100);
        frame.setLayout(new GridLayout(4, 1));
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        /* Name Panel */
        JPanel name_panel = new JPanel(new FlowLayout());

        JLabel name_label = new JLabel("Name");
        name_panel.add(name_label);

        name_field = new JTextField(23);
        name_panel.add(name_field);

        frame.add(name_panel);
        /* -- End of Name Panel -- */

        /* Street Panel */
        JPanel street_panel = new JPanel(new FlowLayout());

        JLabel street_label = new JLabel("Street");
        street_panel.add(street_label);

        street_field = new JTextField(23);
        street_panel.add(street_field);

        frame.add(street_panel);
        /* -- End of Street Panel -- */

        /* City Panel */
        JPanel city_panel = new JPanel(new FlowLayout());

        JLabel city_label = new JLabel("City");
        city_panel.add(city_label);

        city_field = new JTextField(10);
        city_panel.add(city_field);

        JLabel state_label = new JLabel("State");
        city_panel.add(state_label);

        state_field = new JTextField(4);
        city_panel.add(state_field);

        JLabel zip_label = new JLabel("Zip");
        city_panel.add(zip_label);

        zip_field = new JTextField(4);
        city_panel.add(zip_field);

        frame.add(city_panel);
        /* -- End of City Panel -- */

        /* Control Panel */
        JPanel control_panel = new JPanel(new GridLayout(1, 6));

        // ------- New Button -------
        JButton new_button = new JButton("New");
        new_button.addActionListener( e -> resetFields());
        control_panel.add(new_button);

        // ------- Add Button -------
        JButton add_button = new JButton("Add");
        add_button.addActionListener( e -> {
            try {
                RandomAccessFile file = new RandomAccessFile(
                    FILE_DESTINATION, "rw"
                );

                long size = file.length();
                file.seek(size);

                System.out.println("Pointer at: " + file.getFilePointer());

                /* Name Handling */
                String name = name_field.getText();
                FixedLengthStringIO.writeFixedLengthString(name, NAME_SIZE, file);

                System.out.println("Pointer at: " + file.getFilePointer());

                /* Street Handling */
                String street = street_field.getText();
                FixedLengthStringIO.writeFixedLengthString(street, STREET_SIZE, file);

                System.out.println("Pointer at: " + file.getFilePointer());

                /* City Handling */
                String city = city_field.getText();
                FixedLengthStringIO.writeFixedLengthString(city, CITY_SIZE, file);

                System.out.println("Pointer at: " + file.getFilePointer());

                /* State Handling */
                String state = state_field.getText();
                FixedLengthStringIO.writeFixedLengthString(state, STATE_SIZE, file);

                System.out.println("Pointer at: " + file.getFilePointer());

                /* Zip Handling */
                String zip = zip_field.getText();
                FixedLengthStringIO.writeFixedLengthString(zip, ZIP_SIZE, file);

                System.out.println("Pointer at: " + file.getFilePointer());

                file.close();
            } catch (FileNotFoundException err) {
                System.err.println("File was not found");
                err.printStackTrace();
            } catch (EOFException err) {
                resetFields();
            } catch (IOException err) {
                System.err.println("File was not closed");
                err.printStackTrace();
            }
        });
        control_panel.add(add_button);

        // ------- First Button -------
        JButton first_button = new JButton("First");
        first_button.addActionListener( e -> {
            record_number = 0;
            fillFields(0);
        });
        control_panel.add(first_button);

        // ------- Next Button -------
        JButton next_button = new JButton("Next");
        next_button.addActionListener( e -> fillFields(++record_number));
        control_panel.add(next_button);

        // ------- Previous Button -------
        JButton previous_button = new JButton("Previous");
        previous_button.addActionListener( e -> fillFields(--record_number));
        control_panel.add(previous_button);

        // ------- Last Button -------
        JButton last_button = new JButton("Last");
        last_button.addActionListener( e -> {
            try {
                RandomAccessFile file = new RandomAccessFile(FILE_DESTINATION, "r");
                record_number = ((int)file.length() / RECORD_SIZE) - 2;
                fillFields(record_number);
            } catch (FileNotFoundException err) {
                System.err.println("File was not found");
                err.printStackTrace();
            } catch (IOException err) {
                err.printStackTrace();
                resetFields();
            }
        });
        control_panel.add(last_button);

        frame.add(control_panel);
        /* -- End of Control Panel -- */

        frame.setVisible(true);
    }

    private static void fillFields(int record) {
        System.out.println("Showing fields for record: " + record);
        try {
            RandomAccessFile file = new RandomAccessFile(
                    FILE_DESTINATION, "rw"
            );

            System.out.println("File Size: " + file.length() + " | Record Size: " + RECORD_SIZE);
            file.seek(record * RECORD_SIZE);

                /* Name Handling */
            String name = FixedLengthStringIO.readFixedLengthString(NAME_SIZE, file);
            name_field.setText(name);

                /* Street Handling */
            String street = FixedLengthStringIO.readFixedLengthString(STREET_SIZE, file);
            street_field.setText(street);

                /* City Handling */
            String city = FixedLengthStringIO.readFixedLengthString(CITY_SIZE, file);
            city_field.setText(city);

                /* State Handling */
            String state = FixedLengthStringIO.readFixedLengthString(STATE_SIZE, file);
            state_field.setText(state);

                /* Zip Handling */
            String zip = FixedLengthStringIO.readFixedLengthString(ZIP_SIZE, file);
            zip_field.setText(zip);

            file.close();
        } catch (FileNotFoundException err) {
            System.err.println("File was not found");
            err.printStackTrace();
        } catch (EOFException err) {
            record_number = 0;
            fillFields(0);
        } catch (IOException err) {
            System.err.println("File was not closed");
            err.printStackTrace();
        }
    }

    private static void resetFields() {
        name_field.setText("");
        street_field.setText("");
        city_field.setText("");
        state_field.setText("");
        zip_field.setText("");
    }
}
