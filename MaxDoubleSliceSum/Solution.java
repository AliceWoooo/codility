// you can also use imports, for example:
// import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

class Solution {
    public int solution(int[] A) {
        // write your code in Java SE 8
        int N = A.length;
        int[] max_end = new int[N];
        for(int i=1; i<N-1; i++) {
            if(i==1) {
                max_end[i]=Math.max(0,A[i]);
            }
            else {
                max_end[i] = Math.max(0,max_end[i-1]+A[i]);
            }
        }
       
        int[] max_begin = new int[N];
        for(int j=N-2; j>0; j--) {
            if(j==N-2) {
                max_begin[j] =Math.max(0,A[j]);
            }
            else {
                max_begin[j] = Math.max(0,max_begin[j+1]+A[j]);
            }
            
        }
        
        int max = 0;
        for(int k=1; k<N-1; k++) {
            max = Math.max(max,(max_end[k-1]+max_begin[k+1]));
        }
        return max;
    }
}