// you can also use imports, for example:
// import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

class Solution {
    public int solution(String S) {
        // write your code in Java SE 8
        int left = 0;
        for(int i=0; i<S.length(); i++) {
            char c = S.charAt(i);
            if(c=='(') {
                left++;
            }
            else if(c==')') {
                if(left==0) {
                    return 0;
                }
                else {
                    left--;
                }
            }
        }
        return left==0 ? 1 : 0;
    }
}