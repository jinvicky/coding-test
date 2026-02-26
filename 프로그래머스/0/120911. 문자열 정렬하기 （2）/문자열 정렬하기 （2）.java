import java.util.*;

class Solution {
    public String solution(String my_string) {
        String lowerString = my_string.toLowerCase();
        
        char[] sorted = lowerString.toCharArray();
        Arrays.sort(sorted);
        
        StringBuilder sb = new StringBuilder();
        for(char c: sorted) {
            sb.append(c);
        }
        return sb.toString();
    }
}