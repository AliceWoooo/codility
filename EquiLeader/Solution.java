// you can also use imports, for example:
import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

class Solution {
    public int solution(int[] A) {
        // write your code in Java SE 8
        int N = A.length;
        
        // If a number is the leader of both sides, it must be the leader of the whole array.
        // First find the leader and its number
        int leader = 0;
        int count = 0;
        for(int i=0;i<N;i++) {
            if(count==0) {
                leader = A[i];
                count++;
            }
            else {
                if(A[i]==leader) {
                    count++;
                }
                else {
                    count--;
                }
            }
        }
        if(count==0) {
            // No leader
            return 0;
        }
        
        int leaderNum = 0;  // Total number that leader appear
        int[] number = new int[N];  // Number of leader of each position
        for(int i=0; i<N; i++) {
            if(i==0) {
                number[i]=0;
            }
            else {
                number[i]=number[i-1];
            }
            
            if(A[i]==leader) {
                leaderNum++;
                number[i]++;
            }
        }
        if(leaderNum<=(N/2)) {
            // No leader
            return 0;
        }
        
        int result=0;
        for(int s=0; s<N; s++) {
            int left = number[s];
            int right = leaderNum-left;
            if(left>((s+1)/2)&&right>((N-s-1)/2)) {
                result++;
            }
        }
        return result;
    }
}