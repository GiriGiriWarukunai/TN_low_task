import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите строку: ");
        String s = scanner.nextLine();

        Reverse reverse = new Reverse();
        System.out.println("Новая строка: " + reverse.reverseString(s));
    }
}