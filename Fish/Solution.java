// you can also use imports, for example:
import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

class Solution {
    public int solution(int[] A, int[] B) {
        // write your code in Java SE 8
        int N = A.length;
        int upNum = 0;
        Stack<Integer> downFishSize = new Stack<>();
        for(int i=0; i<N; i++) {
            int size = A[i];
            if(B[i]==1) {
                downFishSize.push(size);
            }
            else {
                while(!downFishSize.empty()&&downFishSize.peek()<size) {
                    downFishSize.pop();
                }
                if(downFishSize.empty()) {
                    upNum++;
                }
            }
        }
        return upNum+downFishSize.size();
    }
}