// you can also use imports, for example:
// import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

class Solution {
    public int solution(int N) {
        // write your code in Java SE 8
        int min = Integer.MAX_VALUE;
        for(int i=1; i*i<=N; i++) {
            if(N % i == 0) {
                min = Math.min(min, 2*(i+N/i));
            }
        }
        return min;
    }
}