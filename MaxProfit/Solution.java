// you can also use imports, for example:
import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

class Solution {
    public int solution(int[] A) {
        // write your code in Java SE 8
        int N = A.length;
        if(N==0) {
            return 0;
        }
        else {
            int[] dif = new int[N-1];
            
            for(int i=0; i<N-1; i++) {
                dif[i] = A[i+1]-A[i];
                
            }
            
            int max_end = 0;
            int max = 0;
            for(int j=0; j<N-1; j++) {
                max_end = Math.max(0,max_end+dif[j]);
                max = Math.max(max, max_end);
            }
            return max;
        }
    }
}