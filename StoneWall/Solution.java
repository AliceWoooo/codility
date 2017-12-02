// you can also use imports, for example:
import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

class Solution {
    public int solution(int[] H) {
        // write your code in Java SE 8
        int num=0;
        Stack<Integer> s = new Stack<>();
        for(int i=0; i<H.length; i++) {
            int h = H[i];
            
            // Calculate the number of heights before that is higher than this height, and delete the height that has been calculated.
            while(!s.empty()&&s.peek()>=h) {
                if(s.peek()>h) {
                    // If not equal then number add 1.
                    num++;
                }
                s.pop();
            }
            s.push(h);
        }     
        // Remember to add the remain heights
        return num+s.size();
    }
}