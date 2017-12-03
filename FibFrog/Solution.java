// you can also use imports, for example:
import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

class Solution {
    public int solution(int[] A) {
        // write your code in Java SE 8
        int N = A.length;
        
        // Find the distance that the frog can jump
        ArrayList<Integer> F = new ArrayList<>();
        F.add(0);
        F.add(1);
        int m=2;
        while(F.get(m-1)+F.get(m-2)<=N+1) {
            F.add(F.get(m-1)+F.get(m-2));
            m++;
        }
        
        // Mark the position+1 that the frog can reach
        boolean[] pos = new boolean[N+2];
        pos[0]=true; pos[N+1]=true;
        for(int i=1; i<=N; i++) {
            pos[i]=A[i-1]==1;
        }
        
        // Minimun numbers to jump to the position
        int[] num = new int[N+2];
        Arrays.fill(num, Integer.MAX_VALUE);
        num[0]=0;
        for(int i=0; i<=N+1; i++) {
            if(pos[i]) {
                for(int j=2; j<F.size(); j++) {
                    int p = i+F.get(j);
                    if(p<N+2&&pos[p]) {
                        num[p] = (int)Math.min(num[p],(long)num[i]+1);
                    }
                }
            }
            num[i]= num[i]==Integer.MAX_VALUE? -1 : num[i];
        }
        
        return num[N+1];
    }
}