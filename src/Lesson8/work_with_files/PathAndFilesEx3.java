package Lesson8.work_with_files;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class PathAndFilesEx3 {
    public static void main(String[] args) throws IOException {
        Path file = Paths.get("C:\\Users\\Terenin.Iva\\IdeaProjects\\Zarub2\\src\\Lesson8\\work_with_files\\files\\test1.txt");
        String dialog = "-privet\n-privet\nkak dela\nnorm";
        Files.write(file, dialog.getBytes());
        List<String> list = Files.readAllLines(file);
        System.out.println(list);
    }
}
