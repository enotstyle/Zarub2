package Lesson8.work_with_files;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class PathAndFilesEx1 {
    public static void main(String[] args) throws IOException {
        Path filePath = Paths.get("src/Lesson8/work_with_files/files/test1.txt");
        Path dirPath = Paths.get("C:\\Users\\Terenin.Iva\\IdeaProjects\\Zarub2\\src\\Lesson8\\work_with_files\\files");

        System.out.println("filePath.getFileName() " + filePath.getFileName());
        System.out.println("dirPath.getFileName() " + dirPath.getFileName());
        System.out.println("----------------------------------------------------");

        System.out.println("filePath.getParent() " + filePath.getParent());
        System.out.println("dirPath.getParent() " + dirPath.getParent());
        System.out.println("----------------------------------------------------");

        System.out.println("filePath.getRoot() " + filePath.getRoot());
        System.out.println("dirPath.getRoot() " + dirPath.getRoot());
        System.out.println("----------------------------------------------------");

        System.out.println("filePath.isAbsolute() " + filePath.isAbsolute());
        System.out.println("dirPath.isAbsolute() " + dirPath.isAbsolute());
        System.out.println("----------------------------------------------------");

        System.out.println("filePath.toAbsolutePath() " + filePath.toAbsolutePath());
        System.out.println("dirPath.toAbsolutePath() " + dirPath.toAbsolutePath());
        System.out.println("----------------------------------------------------");

        System.out.println("filePath.toAbsolutePath().getParent() " + filePath.toAbsolutePath().getParent());
        System.out.println("dirPath.toAbsolutePath() " + dirPath.toAbsolutePath());
        System.out.println("----------------------------------------------------");

        System.out.println("filePath.toAbsolutePath() " + dirPath.resolve(filePath));
        System.out.println("----------------------------------------------------");


        Path anotherPath = Paths.get("C:\\Users\\Terenin.Iva\\IdeaProjects\\Zarub2\\src\\Lesson8\\work_with_files\\file\\T\\C\\test.txt");
        System.out.println("filePath.toAbsolutePath() " + anotherPath.relativize(dirPath));
        System.out.println("----------------------------------------------------");

        if(!Files.exists(filePath)) {
            Files.createFile(filePath);
        }

        if(!Files.exists(dirPath)) {
            Files.createDirectory(dirPath);
        }


        System.out.println("Files.isReadable(filePath) " + Files.isReadable(filePath));
        System.out.println("Files.isWritable(filePath) " + Files.isWritable(filePath));
        System.out.println("Files.isExecutable(filePath) " + Files.isExecutable(filePath));
        System.out.println("----------------------------------------------------");

        System.out.println("Files.isSameFile(filePath1, filePath2) " + Files.isSameFile(filePath, filePath));

        System.out.println("----------------------------------------------------");

        System.out.println("Files.size(filePath) " + Files.size(filePath));

        System.out.println("----------------------------------------------------");

        System.out.println("Files.getAttribute(filePath) " + Files.getAttribute(filePath, "creationTime"));

    }
}
