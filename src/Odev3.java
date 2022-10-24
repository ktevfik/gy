import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * @author Tevfik Kadan
 * @created 10/10/2022 - 17:52
 */
public class Odev3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name;
        do {
            System.out.print("Lütfen bir isim giriniz: ");
            name = scanner.nextLine();
        } while (name.length() <= 0);

        Map<Character, Integer> map = new LinkedHashMap<>();

        int counter = 0;
        for (int i = 0;i < name.length();i++) {
            if (map.containsKey(name.charAt(i))) {
                counter = map.get(name.charAt(i));
                map.put(name.charAt(i), ++counter);
            } else {
                counter = 1;
                map.put(name.charAt(i), counter);
            }
        }
        for (Character character : map.keySet()) {
            System.out.printf("%c%d",character, map.get(character));
        }
    }
}
