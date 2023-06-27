import java.util.Arrays;
import java.util.Scanner;


public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите размер массива чисел: ");
        int n = scanner.nextInt();
        int[] a = new int[n];
        System.out.print("Введите массив чисел: ");
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }

        DeleteDuplicate deleteDuplicate = new DeleteDuplicate();
        a = deleteDuplicate.deleteDuplicate(a);

        System.out.println("Исправленный массив: " + Arrays.toString(a));
    }
}