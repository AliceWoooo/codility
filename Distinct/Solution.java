// you can also use imports, for example:
import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

class Solution {
    public int solution(int[] A) {
        // write your code in Java SE 8
        Arrays.sort(A);
        int count=0;
        for(int i=0; i<A.length; i++) {
            if(i==0) {
                count++;
            }
            else if(A[i]!=A[i-1]) {
                count++;
            }
        }
        return count;
    }
}