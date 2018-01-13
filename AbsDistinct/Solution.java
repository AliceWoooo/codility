// you can also use imports, for example:
// import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

class Solution {
    public int solution(int[] A) {
        // write your code in Java SE 8
        long pre = Long.MAX_VALUE;
        int count = 0;
        
        int begin = 0;
        int end = A.length-1;
        while(begin<=end) {
            long left = Math.abs((long)A[begin]);
            long right = Math.abs((long)A[end]);
            long current = 0;
            if(left<right) {
                current = right;
                end--;
            }
            else {
                current = left;
                begin++;
            }
            
            if(current!=pre) {
                pre = current;
                count++;
            }
        }
        return count;
    }
}