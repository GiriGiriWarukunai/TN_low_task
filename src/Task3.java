import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите строку: ");
        String s = scanner.nextLine();
        int j = s.length() - 1;
        //вариант решения через массив символов, без использования специальных методов для класса String
        char[] tmpstr = s.toCharArray();
        for (int i = 0; i < s.length() / 2; i++, j--){
            char tmp = tmpstr[i];
            tmpstr[i] = tmpstr[j];
            tmpstr[j] = tmp;
        }
        s = new String(tmpstr);
        System.out.println("Новая строка: " + s);
    }
}