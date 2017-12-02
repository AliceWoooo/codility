// you can also use imports, for example:
// import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

class Solution {
    public int solution(int N) {
        // write your code in Java SE 8
        int count = 0;
        for(int i=1; (long)i*i<=N; i++) {
            if(i*i==N) {
                count++;
            }
            else {
                if(N % i==0) {
                    count+=2;
                }
            }
        }
        return count;
    }
}