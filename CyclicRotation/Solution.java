// you can also use imports, for example:
// import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

class Solution {
    public int[] solution(int[] A, int K) {
        // write your code in Java SE 8
        int n = A.length;
        if(n!=0) {
	        for(int i=0; i<K; i++) {
	             int temp = A[n-1];
	             for(int j=n-1; j>0; j--) {
	                A[j]=A[j-1];    
	             }
	             A[0]=temp;
	        }
        }
        return A;
    }
}