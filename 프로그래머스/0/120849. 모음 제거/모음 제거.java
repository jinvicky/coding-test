import java.util.*;

class Solution {
    public String solution(String my_string) {
        // 띄어쓰기 ' '면 그대로 append해야 하네 
        // a, e, i, o, u 면 ""를 붙인다. 
        
        StringBuilder sb = new StringBuilder();
        
        for(char c : my_string.toCharArray()) {
            if(c == 'a' ||
               c == 'e' ||
               c == 'i' ||
               c == 'o' ||
               c == 'u') {
                
            } else {
                sb.append(c);
            }
            
        }
        
        
        return sb.toString();
    }
}