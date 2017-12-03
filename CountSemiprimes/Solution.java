// you can also use imports, for example:
// import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

class Solution {
    public int[] solution(int N, int[] P, int[] Q) {
        // write your code in Java SE 8
        int[] primeNum = new int[N+1];
        for(int i=2; i*2<=N; i++) {
            if((long)i*i<=N) {
                primeNum[i*i]++;
            }
            
            int k = i+i;
            while(k<=N) {
                primeNum[k]= primeNum[i]!=0? 1 : primeNum[k]+1;
                k+=i;
            }
        }
        
        int[] semiNum = new int[N+1];
        int sum=0;
        for(int i=0; i<N+1;i++) {
            if(primeNum[i]==2) {
                sum++;
            }
            semiNum[i]=sum;
        }
        
        int[] result = new int[P.length];
        for(int m=0; m<P.length; m++) {
            int begin = P[m];
            int end = Q[m];
            
            result[m] = semiNum[end]-semiNum[begin-1];
        }
        return result;
    }
}