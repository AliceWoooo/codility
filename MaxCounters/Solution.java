// you can also use imports, for example:
// import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

class Solution {
    public int[] solution(int N, int[] A) {
        // write your code in Java SE 8
        int[] counter = new int[N];
        for(int i=0;i<N;i++) {
            counter[i]=0;
        }
        
        int M = A.length;
        int max = 0;
        int preMax = max;
        for(int k=0; k<M; k++) {
            int x = A[k];
            if(x==N+1) {
                preMax = max;
            }
            else if( 1<=x && x<=N ) {
                counter[x-1] = Math.max(preMax, counter[x-1]);
                counter[x-1]++;
                max = Math.max(max,counter[x-1]);
            }
        }
        
        for(int n=0; n<N; n++) {
            counter[n] = Math.max(preMax, counter[n]);   
        }
        
        return counter;
    }
}