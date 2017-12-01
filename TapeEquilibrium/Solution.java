// you can also use imports, for example:
import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

class Solution {
    public int solution(int[] A) {
        // write your code in Java SE 8
        int n = A.length;
        int sum = 0;
        for(int i=0; i<n; i++) {
            sum+=A[i];    
        }
        int part1 = 0;
        int part2 = sum;
        int min = Integer.MAX_VALUE;
        for(int i=0; i<n-1; i++) {
            part1+=A[i];
            part2-=A[i];
            int dif = Math.abs(part1-part2);
            min = Math.min(min,dif);
        }
        return min;
    }
}