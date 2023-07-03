public class Reverse {

    String reverseString(String s) {
        Swap swap = new Swap();
        int j = s.length() - 1;
        char[] a = s.toCharArray();
        for (int i = 0; i < s.length() / 2; i++, j--) {
            swap.swapArrElems(a, i, j);
        }
        return new String(a);
    }
}
