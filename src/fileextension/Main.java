package fileextension;

import java.io.File;
import java.io.FileNotFoundException;
import java.nio.file.Path;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("src/kelimeler.txt");
        System.out.println("******READ LINE BY NUMBER******");
        System.out.println(ReaderUtils.readLineAt(file, 2));

        System.out.println("******GET TOTAL WORD COUNT******");
        System.out.println(ReaderUtils.getWordCounter(file));

        System.out.println("******GET ALL WORDS******");
        ArrayList<String> words = ReaderUtils.getWords(file);
        for (String word : words) {
            System.out.println(word);
        }

        System.out.println("******GET LINES******");
        ArrayList<String> lines = ReaderUtils.readByLine(file);
        for (String line : lines) {
            System.out.println(line);
        }
    }
}
