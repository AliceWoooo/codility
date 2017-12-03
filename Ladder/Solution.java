// you can also use imports, for example:
// import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

class Solution {
    public int[] solution(int[] A, int[] B) {
        // write your code in Java SE 8
        int L = A.length;

        int[] rungs = new int[L+1];
        rungs[0]=1;
        rungs[1]=1;
        for(int i=2;i<=L; i++) {
            rungs[i]=(rungs[i-1]+rungs[i-2]) % (1<<30);
        }
        
        int[] result = new int[L];
        for(int i=0; i<L; i++) {
            result[i]=(int) (rungs[A[i]] % (1<<B[i]));
        }
        return result;
        
    }
}