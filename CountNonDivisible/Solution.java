// you can also use imports, for example:
// import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

class Solution {
    public int[] solution(int[] A) {
        // write your code in Java SE 8
        int N = A.length;
        int max =0;
        for(int i=0; i<N; i++) {
            max = Math.max(max,A[i]);
        }
        
        int[] count = new int[max+1];
        for(int i=0; i<N; i++) {
            count[A[i]]++;
        }
        
        int[] num = new int[max+1];
        for(int i=1; i*i<=max; i++) {
            
            // Says 6=2*3, when i=2, num[6] has already add count[2] and count[3], therefore no need to count 3*2 again, then it should start from i^2.
            int k = i*i;
            while(k<=max) {
                num[k]+=count[i];
                // Count once if squre
                if(k!=i*i) {
                    num[k]+=count[k/i];
                }
                k+=i;
            }
        }
        
        int[] result = new int[N];
        for(int i=0; i<N; i++) {
            result[i] = N-num[A[i]];
        }
        return result;
    }
}