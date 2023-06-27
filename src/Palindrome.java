public class Palindrome {

    public boolean isPalindrome (String s){
        int left_idx, right_idx = s.length() - 1;
        for (left_idx = 0; left_idx < s.length() / 2; left_idx++, right_idx--){
            if(s.charAt(left_idx) != s.charAt(right_idx)){
                return false;
            }
        }
        return true;
    }
}
