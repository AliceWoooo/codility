// you can also use imports, for example:
import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

class Solution {
    public int solution(String S) {
        // write your code in Java SE 8
        Stack<Character> s = new Stack<>();
        for(int i=0; i<S.length(); i++) {
            char c = S.charAt(i);
            if(c=='{'||c=='['||c=='(') {
                s.push(c);
            }
            else if(c=='}'||c==']'||c==')') {
                if(s.empty()) {
                    return 0;
                }
                else {
                    char p = s.pop();
                    if(p=='{'&&c!='}') {
                        return 0;
                    }
                    if(p=='['&&c!=']') {
                        return 0;
                    }
                    if(p=='('&&c!=')') {
                        return 0;
                    }
                }
            }
        }
        if(s.empty()) {
            return 1;
        }
        else {
            return 0;
        }
    }
}