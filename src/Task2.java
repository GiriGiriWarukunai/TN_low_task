import java.util.Arrays;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите размер массива чисел: ");
        int n = scanner.nextInt();
        int[] a = new int[n];
        System.out.print("Введите массив чисел: ");
        for(int i = 0; i < n; i++)
            a[i] = scanner.nextInt();


        boolean f = true;
        int i;
        //проходим все начальные элементы, которые не повторяются
        for(i = 1; f && i < n; i++)
            for(int j = 0; f && j < i; j++)
                f = a[i] != a[j];

        //если дошли до конца массива, значит повторяющихся элементов в массиве не было
        if(f)
            System.out.println("Повторов в массиве не было");
        else{
            //я решил делать все в одном массиве, а не создавать новый, куда уже бы записывал уникальные элементы,
            //поэтому write - индекс, на место которого будет записан следующий уникальный элемент
            int write = i - 1;

            for(int k = i; k < n; k++){
                f = true;
                for(int j = 0; f && j < k; j++)
                    f = a[k] != a[j];
                //если элемент a[k] раньше не встречался, то запишем его на место a[write]
                if(f) {
                    a[write] = a[k];
                    write++;
                }
            }
            //обрезаю оставшуюся часть массива
            a = Arrays.copyOfRange(a, 0, write);
            System.out.println("Исправленный массив: " + Arrays.toString(a));

        }



    }
}