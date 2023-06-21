import java.util.Arrays;
import java.util.Scanner;

class DeleteDuplicate {

    int[] deleteDuplicate(int[] a){
        boolean f = true;
        int i;
        //проходим все начальные элементы, которые не повторяются
        for (i = 1; f && i < a.length; i++) {
            for (int j = 0; f && j < i; j++) {
                f = a[i] != a[j];
            }
        }
        //если дошли до конца массива, значит повторяющихся элементов в массиве не было
        if(f) {
            return a;
        }
        else {
            //я решил делать все в одном массиве, а не создавать новый, куда уже бы записывал уникальные элементы,
            //поэтому w - индекс, на место которого будет записан следующий уникальный элемент
            int w = i - 1;

            for(int k = i; k < a.length; k++){
                f = true;
                for(int j = 0; f && j < k; j++)
                    f = a[k] != a[j];
                //если элемент a[k] раньше не встречался, то запишем его на место a[write]
                if(f) {
                    a[w] = a[k];
                    w++;
                }
            }
            //обрезаю оставшуюся часть массива
            a = Arrays.copyOfRange(a, 0, w);
            return a;

        }

    }
}

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