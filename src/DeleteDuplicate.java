import java.util.Arrays;

public class DeleteDuplicate {
    int[] deleteDuplicate(int[] a){
        int read_idx;

        repeatingElement:
        for (read_idx = 1; read_idx < a.length; read_idx++) {
            for (int prev_idx = 0; prev_idx < read_idx; prev_idx++) {
                if (a[read_idx] == a[prev_idx]){
                    break repeatingElement;
                }
            }
        }

        if(read_idx == a.length) {
            return a;
        }
        else {
            int write_idx = read_idx;
            for(; read_idx < a.length; read_idx++){
                int prev_idx = 0;
                for(; prev_idx < read_idx; prev_idx++) {
                    if (a[read_idx] == a[prev_idx]) {
                        break;
                    }
                }
                if(prev_idx == read_idx) {
                    a[write_idx] = a[read_idx];
                    write_idx++;
                }
            }
            a = Arrays.copyOfRange(a, 0, write_idx);
            return a;
        }
    }
}
