package Lesson8.work_with_files;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class PathAndFilesEx2 {
    public static void main(String[] args) throws IOException {
        Path filePath = Paths.get("C:\\Users\\Terenin.Iva\\IdeaProjects\\Zarub2\\src\\Lesson8\\work_with_files\\files\\test1.txt");
        Path dirPath = Paths.get("C:\\Users\\Terenin.Iva\\IdeaProjects\\Zarub2\\src\\Lesson8\\work_with_files\\test");
        Path dirFilesPath = Paths.get("C:\\Users\\Terenin.Iva\\IdeaProjects\\Zarub2\\src\\Lesson8\\work_with_files\\files");

//        Files.copy(filePath, dirPath.resolve("test1.txt"), StandardCopyOption.REPLACE_EXISTING);
//        Files.copy(dirPath, dirFilesPath.resolve("test"));

//        Files.move(dirPath.resolve("test1.txt"), dirFilesPath.resolve("test\\test1.txt"));
    }
}
