// you can also use imports, for example:
import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

class Solution {
    public int solution(int[] A) {
        // write your code in Java SE 8
        int N = A.length;
        int[] B = new int[N];
        for(int i=0; i<N; i++) {
            B[i]=A[i];
        }
        Arrays.sort(B);
        
        int count = 1;
        int pre = 0;
        int dom = 0;
        int flag =0;
        for(int p=0;p<N;p++) {
            if(p==0) {
                pre = B[p];
            } 
            else {
                if(B[p]==pre) {
                    count++;
                }
                else {
                    pre=B[p];
                    count = 1;
                }
            }
            
            if(count>(N/2)) {
                flag = 1;
                dom = B[p];
                break;
            }  
        }
        
        if(flag==1) {
            for(int j=0; j<N; j++) {
                if(dom==A[j]) {
                    return j;
                }
            }
        }
        return -1;
    }
}