import java.util.*;

/*
Konsoldan girilen ifadeyi zipleyip harfleri listeye atmak (arraylist kullanarak)
Örnek: numankaraaslan -> numakrsl
 */

public class Odev2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name;
        do {
            System.out.print("Lütfen bir isim giriniz: ");
            name = scanner.nextLine();
        } while (name.length() <= 0);

        ArrayList<Character> arrayList = new ArrayList<>();
        for (int i = 0;i < name.length();i++) {
            if (!isExist(arrayList, name.charAt(i))) {
                arrayList.add(name.charAt(i));
            }
        }
        for (Character c : arrayList) {
            System.out.print(c);
        }
        System.out.println();

    }
    public static boolean isExist(ArrayList<Character> arr, char character) {
        for (int i = 0;i < arr.size();i++) {
            if (arr.get(i).equals(character)) {
                return true;
            }
        }
        return false;
    }


}

/*
1 2 3 -> 9 8 7
4 5 6 -> 6 5 4
7 8 9 -> 3 2 1
 */

/*
1 2 3 -> 7 4 1
4 5 6 -> 8 5 2
7 8 9 -> 9 6 3
 */

/*
"aaaafggg assssvv t"
a4f1g3 a1s4v2 t1
hangi karakterden kaç tane olduğunu yaz
 */

/*
4 işlem yapan hesap makinesi kütüphanesi yazılıp başka projede kullanılması
https://www.java67.com/2017/04/how-to-add-jar-file-in-eclipse-project.html
https://www.tutorialspoint.com/eclipse/eclipse_create_jar_files.htm#
 */