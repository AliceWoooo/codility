// you can also use imports, for example:
// import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

class Solution {
    public int solution(int[] A) {
        // write your code in Java SE 8
        int east=0;
        int west=0;
        for(int i=0; i<A.length; i++) {
            if(A[i]==0) {
                east++;
            }
            else if(A[i]==1) {
                west++;    
            }
        }
        
        int count=0;
        for(int p=0; p<A.length; p++) {
            int direct = A[p];
            if(direct==0) {
                east--;
                count+=west;
                
                if(count>1000000000) {
                    return -1;
                }
            }
            else if(direct==1) {
                west--;
            } 
        }
        
        return count;
    }
}