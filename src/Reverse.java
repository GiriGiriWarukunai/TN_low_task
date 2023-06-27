public class Reverse {

    String reverseString(String s) {
        int j = s.length() - 1;
        char[] a = s.toCharArray();
        for (int i = 0; i < s.length() / 2; i++, j--) {
            char tmp = a[i];
            a[i] = a[j];
            a[j] = tmp;
        }
        return new String(a);
    }
}
