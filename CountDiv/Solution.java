// you can also use imports, for example:
// import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

class Solution {
    public int solution(int A, int B, int K) {
        // write your code in Java SE 8
        int min = (A/K+1)*K;  // div that > A
        if(A%K==0) {
            min-=K;         // div that >= A
        }
        
        int max = (B/K)*K;  // div that <= B
        
        return (max-min)/K+1;
    }
}