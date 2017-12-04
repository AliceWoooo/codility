// you can also use imports, for example:
// import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

class Solution {
    public int solution(int K, int M, int[] A) {
        // write your code in Java SE 8
        int N = A.length;
        int sum = 0;
        int maxEle = 0;
        for(int i=0; i<N; i++) {
            sum+=A[i];
            maxEle = Math.max(maxEle, A[i]);
        }
        
        int lower = maxEle;
        int higher = sum;
        int result = 0;
        while(lower<=higher) {
            int mid = (lower+higher)/2;
            int blockNum = findBlocksNum(A,mid);
            if(blockNum<=K) {
                result = mid;
                higher = mid-1;
            }
            else {
                lower = mid+1;
            }
            
        }
        return result;
    }
    
    public int findBlocksNum(int[] A, int max) {
        int N = A.length;
        int blockNum = 1;
        int remain = max;
        for(int a:A) {
            if(remain<a) {
                remain = max;
                blockNum++;
            }
            remain-=a;
        }
        return blockNum;
    }
}