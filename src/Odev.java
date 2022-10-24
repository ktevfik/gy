import java.util.ArrayList;
import java.util.Scanner;

/*
Konsoldan girilen string içerisinde hangi harften kaç tane bulunduğunu sıralı bir şekilde yazmak (arraylist kullanarak)
Örnek: numan -> n2u1m1a1
 */

public class Odev {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name;
        do {
            System.out.print("Lütfen bir isim giriniz: ");
            name = scanner.nextLine();
        } while (name.length() <= 0);

        ArrayList<Integer> arrayList = new ArrayList<>();
        int counter = 0;
        for (int i = 0;i < name.length();i++) {
            for (int j = 0; j< name.length();j++) {

                if (name.charAt(i) == name.charAt(j)) {
                    counter++;
                }
            }
            arrayList.add(counter);
            counter = 0;
        }
        for (int i = 0;i < name.length();i++) {
            if (!isUsedBefore(name, i)) {
                System.out.print(name.charAt(i));
                System.out.print(arrayList.get(i));
            }
        }
    }

    public static boolean isUsedBefore(String name, int j) {
        for (int i = 0;i < name.length();i++) {
            if (name.charAt(i) == name.charAt(j) && i < j) {
                return true;
            }
        }
        return false;
    }

}
// konsoldan girilen isimdeki ünlü harfler için 1,2,3,4,5,6,7,8 yazdırılması
// a1 e2 ı3 i4 o5 ö6 u7 ü8