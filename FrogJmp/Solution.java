// you can also use imports, for example:
// import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

class Solution {
    public int solution(int X, int Y, int D) {
        // write your code in Java SE 8
        int min = 0;
        if(Y>X) {
            int dif = Y-X;
            min = dif/D;
            if((dif % D)!=0) {
                min++;
            }
        }
        return min;
    }
}