import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите строку: ");
        String s = scanner.nextLine();
        boolean res = true;
        int j = s.length() - 1;
        for(int i = 0; i < s.length() / 2 && res; i++, j--)
            res = s.charAt(i) == s.charAt(j);
        if(res)
            System.out.println(s + " - палиндром");
        else
            System.out.println(s + " - не палиндром");

    }
}