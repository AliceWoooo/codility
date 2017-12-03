// you can also use imports, for example:
// import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

class Solution {
    public int solution(int[] A) {
        // write your code in Java SE 8
        int N = A.length;
        
        int factorNum=0;
        for(int i=1; i*i<=N; i++) {
            if(i*i==N) {
                factorNum++;
            }
            else {
                if(N%i==0) {
                    factorNum+=2;
                }
            }
        }
        
        int[] factors = new int[factorNum];
        int index = 0;
        for(int i=1; i<=N; i++) {
            if(N%i==0) {
                factors[index]=i;
                index++;
            }
        }
        
        int[] peakNum = new int[N];
        int peakSum = 0;
        for(int i=0; i<N; i++) {
            if(i==0||i==N-1) {
                peakNum[i] = peakSum;
            }
            else {
                if(A[i-1]<A[i]&&A[i]>A[i+1]) {
                    peakSum++;
                }
                peakNum[i] = peakSum;
            }
        }
        
        int max = 0;
        for(int i=0; i<factorNum; i++) {
            int block = factors[i];
            int num = N/block;
            int start = 0;
            int flag = 1;
            for(int n=0; n<block; n++) {
                int leftNum = start==0? 0 : peakNum[start-1];
                int pNum = peakNum[start+num-1]-leftNum;
                start += num;
                if(pNum==0) {
                    flag=0;
                    break;
                }
            }
            if(flag==1) {
                max = Math.max(max, block);
            }
        }
        return max;
    }
}