// you can also use imports, for example:
// import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

class Solution {
    public int solution(int[] A, int[] B) {
        // write your code in Java SE 8
        int num = 0;
        for(int m=0; m<A.length; m++) {
            int a = A[m]; int b = B[m];
            long check = gcd(a,b);
            if(isPD(a,b,check)) {
                num++;
            }
        }
        return num;
    }
    
    public boolean isPD(long a, long b, long check) {
        long common = gcd(a,b);
        long remain = a*b/(common*common);
        if(common==1){
            return check%remain==0;
        }
        else {
            return isPD(common,remain,check);
        }
    }
    
    public long gcd(long a, long b) {
        long max = Math.max(a,b);
        long min = Math.min(a,b);
        if(max%min==0) {
            return min;
        }
        else {
            return gcd(min, max%min);
        }
    }
}