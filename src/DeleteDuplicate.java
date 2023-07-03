import java.util.Arrays;

public class DeleteDuplicate {
    int[] deleteDuplicate(int[] a) {
        int readIdx = 1;
        int writeIdx = 1;
        for (; readIdx < a.length; readIdx++) {
            int prevIdx = 0;
            for (; prevIdx < readIdx; prevIdx++) {
                if (a[readIdx] == a[prevIdx]) {
                    break;
                }
            }
            if (prevIdx == readIdx) {
                a[writeIdx] = a[readIdx];
                writeIdx++;
            }
        }
        a = Arrays.copyOfRange(a, 0, writeIdx);
        return a;
    }
}
