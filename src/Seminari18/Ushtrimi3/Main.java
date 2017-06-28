package Seminari18.Ushtrimi3;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * Konverto nje string binar ne decimal
 *
 * Nderto nje program qe konverton nje skedar text ne utf8
 *
 *
 */
public class Main {
    public static void main(String[] args)
    {
        try {
            FileInputStream fis = new FileInputStream(args[0]);
            byte[] contents = new byte[fis.available()];

            fis.read(contents, 0, contents.length);
            String asString = new String (contents, "ISO8859_1");
            byte[] newByte = asString.getBytes("UTF-8");
            FileOutputStream fos = new FileOutputStream(args[1]);
            fos.write(newByte);
            fos.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
