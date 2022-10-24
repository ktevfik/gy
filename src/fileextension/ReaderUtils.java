package fileextension;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public abstract class ReaderUtils {

    public static ArrayList<String> getWords(File file) throws FileNotFoundException {
        Scanner scanner = new Scanner(file);
        ArrayList<String> words = new ArrayList<>();
        while (scanner.hasNext()) {
            words.add(scanner.next());
        }
        return words;
    }

    public static int getWordCounter(File file) throws FileNotFoundException {
        Scanner scanner = new Scanner(file);
        int counter = 0;
        while (scanner.hasNext()) {
            counter++;
            scanner.next();
        }
        return counter;
    }

    public static String readLineAt(File file, int lineNumber) throws FileNotFoundException {
        Scanner scanner = new Scanner(file);
        ArrayList<String> lines = new ArrayList<>();
        while (scanner.hasNextLine()) {
            lines.add(scanner.nextLine());
        }
        if (lines.size() < lineNumber) {
            return "Line not found.";
        }
        return lines.get(lineNumber - 1);
    }

    public static ArrayList<String> readByLine(File file) throws FileNotFoundException {
        BufferedReader reader;
        ArrayList<String> arrayList = new ArrayList<>();
        try {
            reader = new BufferedReader(new FileReader(file));

            String line = reader.readLine();
            while (line != null) {
                arrayList.add(line);
                // read next line
                line = reader.readLine();
            }
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return arrayList;
    }
}
