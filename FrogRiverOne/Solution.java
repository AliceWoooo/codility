// you can also use imports, for example:
import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

class Solution {
    public int solution(int X, int[] A) {
        // write your code in Java SE 8
        int flag = -1;
        int sum = 0;
        boolean[] hasLeaves = new boolean[X];
        for(int i=0; i<A.length; i++) {
            int pos = A[i];
            if(!hasLeaves[pos-1]) {
                hasLeaves[pos-1]=true;
                sum++;
            }
            if(sum==X) {
                flag=i;
                return flag;
            }
        }
        return flag;
    }
}