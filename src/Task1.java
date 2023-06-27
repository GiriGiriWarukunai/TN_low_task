import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите строку: ");
        String s = scanner.nextLine();

        Palindrome palindrome = new Palindrome();
        if (palindrome.isPalindrome(s)) {
            System.out.println(s + " - палиндром");
        }
        else {
            System.out.println(s + " - не палиндром");
        }
    }
}