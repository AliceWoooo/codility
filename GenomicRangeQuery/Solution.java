// you can also use imports, for example:
// import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

class Solution {
    public int[] solution(String S, int[] P, int[] Q) {
        // write your code in Java SE 8
        int M = P.length;
        int N = S.length();
        
        // number of appearance before each position
        int[] A = new int[N+1];
        int[] C = new int[N+1];
        int[] G = new int[N+1];
        int[] T = new int[N+1];
        A[0]=0; C[0]=0; G[0]=0; T[0]=0;
        for(int n=1; n<=N; n++) {
            A[n]=A[n-1];    C[n]=C[n-1];
            G[n]=G[n-1];    T[n]=T[n-1];
            
            char c = S.charAt(n-1);
            if(c=='A') { A[n]++; }
            else if(c=='C') { C[n]++; }
            else if(c=='G') { G[n]++; }
            else if(c=='T') { T[n]++; }
        }
        
        int[] result = new int[M];
        for(int m=0; m<M; m++) {
            int begin = P[m];
            int end = Q[m];
            
            if(A[end+1]-A[begin]>0) { result[m] = 1; }
            else if (C[end+1]-C[begin]>0) { result[m] = 2; }
            else if (G[end+1]-G[begin]>0) { result[m] = 3; }
            else if (T[end+1]-T[begin]>0) { result[m] = 4; }
        }
        return result;
    }
}