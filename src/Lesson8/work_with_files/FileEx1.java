package Lesson8.work_with_files;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;

public class FileEx1 {
    public static void main(String[] args) throws IOException {
        File file = new File("src/Lesson8/work_with_files/files/test1.txt");
        File folder = new File("src/Lesson8/work_with_files/files/");
        File file2 = new File("src/Lesson8/work_with_files/files/test228.txt");
        File folder2 = new File("src/Lesson8/work_with_files/files228");

        System.out.println("file.getAbsoluteFile() " + file.getAbsoluteFile());
        System.out.println("folder.getAbsoluteFile() " + folder.getAbsoluteFile());
        System.out.println("----------------------------------");

        System.out.println("file.isAbsolute() " + file.isAbsolute());
        System.out.println("folder.isAbsolute() " + folder.isAbsolute());
        System.out.println("----------------------------------");

        System.out.println("file.isDirectory() " + file.isDirectory());
        System.out.println("folder.isDirectory() " + folder.isDirectory());
        System.out.println("----------------------------------");

        System.out.println("file.exists() " + file.exists());
        System.out.println("file2.exists() " + file2.exists());
        System.out.println("folder.exists() " + folder.exists());
        System.out.println("----------------------------------");


        System.out.println("file2.createNewFile() " + file2.createNewFile());
        System.out.println("folder2.folder2() " + folder2.mkdir());
        System.out.println("----------------------------------");

        System.out.println("file2.length() " + file2.length());
        System.out.println("folder2.folder2() " + folder2.length());
        System.out.println("----------------------------------");

        System.out.println("file2.delete() " + file2.delete());
        System.out.println("folder2.delete() " + folder2.delete());
        System.out.println("----------------------------------");


        File[] files = folder.listFiles();
        System.out.println(Arrays.toString(files));
        System.out.println("----------------------------------");

        System.out.println("file.isHidden() " + file.isHidden());
        System.out.println("folder.isHidden() " + folder.isHidden());
        System.out.println("----------------------------------");

        System.out.println("file.canWrite() " + file.canWrite());
        System.out.println("folder.canWrite() " + folder.canWrite());
        System.out.println("----------------------------------");

        System.out.println("file.canRead() " + file.canRead());
        System.out.println("folder.canRead() " + folder.canRead());
        System.out.println("----------------------------------");

        System.out.println("file.canExecute() " + file.canExecute());
        System.out.println("folder.canExecute() " + folder.canExecute());
        System.out.println("----------------------------------");

    }
}
