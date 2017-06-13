package Laboratori8.Ushtrimi1;

import java.io.IOException;
import java.io.RandomAccessFile;

public class Main {
    public static void main(String[] args) throws IOException {
        RandomAccessFile f = new RandomAccessFile("src/Laboratori8/Ushtrimi1/test", "rw");
        f.seek(100);
        f.writeUTF("Programim Java");

        f.close();

        RandomAccessFile f_r = new RandomAccessFile("src/Laboratori8/Ushtrimi1/test", "r");
        f_r.seek(100);
        System.out.println(f_r.readUTF());

        f_r.close();
    }
}
