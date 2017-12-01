import java.util.*;

class Solution { 
	
	public int solution(int N) {
		
		String binary = Integer.toBinaryString(N);
        int max = 0;
        int count = 0;
        for(int i=0; i<binary.length(); i++) {
            char c = binary.charAt(i);
            if(c=='1') {
                max = Math.max(max, count);
                count=0;
            }
            else if(c=='0') {
                count++;
            }
        }
        return max;
	}
	
}