package Seminari12.Direktoria;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributeView;
import java.nio.file.attribute.BasicFileAttributes;
import java.nio.file.attribute.FileTime;
import java.util.Scanner;

/**
 * Mer skedar ose direktori
 * Printon te dhenat mbi elementin (emrin e pathit, daten e krijimit)
 * Nese elementi eshte direktori merr e kontrollon nese ka elemente perberes
 * Nese ka afishon nje mesazh, perndryshe fshin skedarin ose direktorine
 * Perdorni klasen File
 */

/**
 * NOTES:
 * --------
 * Try with '.' first. It will give you the current project directory
 * (if the path has been configured properly)
 * Then you can play around with absolute paths in your file system.
 * Remember... If it does find the fold but with no files inside it will delete
 * it.
 */

public class Main
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the directory path:");
        String directory_from_user = in.nextLine();

        try {
            File directory = new File(directory_from_user);
            String directory_path = directory.getCanonicalPath();
            Path p = Paths.get(directory_path);
            BasicFileAttributes view =
                    Files.getFileAttributeView(p, BasicFileAttributeView.class)
                        .readAttributes();
            FileTime created_at = view.creationTime();
            System.out.println(
                "Directory: " + directory_path + "\n" +
                "Created at: " + created_at
            );

            if (directory.listFiles() != null) {
                System.out.println("The directory has content.");
                return;
            }

            System.out.println("The directory is empty. Deleting it...");

            if (directory.delete()) {
                System.out.println("Directory got deleted.");
            } else {
                System.out.println("Directory was not deleted.");
            }

        } catch (IOException e) {
            System.out.println("Directory was not found.");
        }
    }
}
