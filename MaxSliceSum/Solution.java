// you can also use imports, for example:
// import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

class Solution {
    public int solution(int[] A) {
        // write your code in Java SE 8
        int max_end = 0;
        int max = 0;
        int maxEle = Integer.MIN_VALUE;
        for(int a:A) {
            max_end = Math.max(0,max_end+a);
            maxEle = Math.max(a,maxEle);
            max = Math.max(max,max_end);
        }
        
        return max==0 ? maxEle : max;
    }
}