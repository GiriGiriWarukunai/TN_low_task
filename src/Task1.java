import java.util.Scanner;

class Palindrome {
    boolean isPalindrome (String s){
        int i, j = s.length() - 1;
        for (i = 0; i < s.length() / 2 && s.charAt(i) == s.charAt(j); i++, j--);
        return i >= s.length() / 2;
    }
}
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