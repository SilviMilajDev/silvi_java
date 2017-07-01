package Experiments.ObjectFiles;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

public class Main {

    public static void main(String[] args) {
        List<ProductRecord> l = new ArrayList<>();
        l.add(new ProductRecord(102, "This", "Product1", "Arel", 100, 1, 205));
        l.add(new ProductRecord(103, "This", "Product2", "Arel", 80, 2, 103));
        l.add(new ProductRecord(104, "This", "Product3", "Arel", 140, 3, 342));

        writeToFile(l, "src/Experiments/ObjectFiles/store");

        List<ProductRecord> list = readFromFile("src/Experiments/ObjectFiles/store");
        for (ProductRecord productRecord : list) {
            System.out.println(productRecord.getProductName());
        }
    }

    public static void writeToFile(List<ProductRecord> list, String file) {
        ObjectOutputStream outStream = null;
        try {
            outStream = new ObjectOutputStream(new FileOutputStream(file));
            for (ProductRecord p : list) {
                outStream.writeObject(p);
            }

        } catch (IOException ioException) {
            System.err.println("Error opening file.");
        } catch (NoSuchElementException noSuchElementException) {
            System.err.println("Invalid input.");
        } finally {
            try {
                if (outStream != null)
                    outStream.close();
            } catch (IOException ioException) {
                System.err.println("Error closing file.");
            }
        }
    }

    public static List<ProductRecord> readFromFile(String file) {
        List<ProductRecord> list = new ArrayList<>();
        ObjectInputStream inputStream = null;
        try {
            inputStream = new ObjectInputStream(new FileInputStream(file));
            while (true) {
                ProductRecord p = (ProductRecord) inputStream.readObject();
                list.add(p);
            }
        } catch (EOFException eofException) {
            return list;
        } catch (ClassNotFoundException classNotFoundException) {
            System.err.println("Object creation failed.");
        } catch (IOException ioException) {
            System.err.println("Error opening file.");
        } finally {
            try {
                if (inputStream != null)
                    inputStream.close();
            } catch (IOException ioException) {
                System.err.println("Error closing file.");
            }
        }
        return list;
    }
}