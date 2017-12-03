// you can also use imports, for example:
import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

class Solution {
    public int solution(int[] A) {
        // write your code in Java SE 8
        int N = A.length;

        // peak after this position
        int[] peak = new int[N];
        int peakIndex = -1;
        for(int i=N-1;i>=0; i--) {
            if(i==N-1||i==0) {
                peak[i]=peakIndex;
            }
            else {
                if(A[i-1]<A[i]&&A[i]>A[i+1]) {
                    peakIndex=i;
                }
                peak[i]=peakIndex;
            }
        }
        
        int max = 0;
        for(int i=1; (i-1)*i<=N; i++) {
            int p = 0;
            int flag = 1;
            for(int j=0; j<i; j++) {
                if(p>=N||peak[p]==-1) {
                    flag=0;
                    break;
                }
                p = peak[p]+i;  // next peak
            }
            if(flag==1) {
                max = Math.max(max,i);
            }
        }
        return max;
        
        
    }
}