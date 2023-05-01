package Lesson8.work_with_files;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterEx {
    public static void main(String[] args) throws IOException {
        String rubai = """
                Много лет размышлял я над жизнью земной.
                Непонятного нет для меня под луной.
                Мне известно, что мне ничего не известно! —
                Вот последняя правда, открытая мной.""";


        FileWriter writer = null;
        try {
            writer = new FileWriter("C:\\Users\\Ivan\\IdeaProjects\\Zarub2\\src\\Lesson8\\work_with_files\\files\\test1.txt", true);
            for (int i = 0; i < rubai.length(); i++) {
                writer.write(rubai.charAt(i)); // записываем посимвольно
            }
            writer.write("\nprivet\n"); //записываем строку
            writer.write(rubai, 10, 20); //записываем строку с и до символа
            writer.write(rubai.toCharArray()); //записываем массив чаров
            writer.write(rubai.toCharArray(), 3, 5); //записываем массив чаров с и до символа
            writer.append('@'); // добавляем в файл чар

            System.out.println("done");
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            writer.close();
        }
    }
}
