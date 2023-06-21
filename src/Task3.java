import java.util.Scanner;

class Reverse {

    String reverseString(String s){
        int j = s.length() - 1;
        //вариант решения через массив символов, без использования специальных методов для класса String
        char[] a = s.toCharArray();
        for (int i = 0; i < s.length() / 2; i++, j--){
            char tmp = a[i];
            a[i] = a[j];
            a[j] = tmp;
        }
        return new String(a);
    }
}
public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите строку: ");
        String s = scanner.nextLine();

        Reverse reverse = new Reverse();
        s = reverse.reverseString(s);
        System.out.println("Новая строка: " + s);
    }
}