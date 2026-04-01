import java.util.*;
class Solution {
    public String solution(String s) {
        // TreeSet을 써서 문자들을 다 넣는거야. 그리고 그걸 순서대로 StringBuilder로 append하자. 
        StringBuilder sb = new StringBuilder();
        TreeSet<Character> tSet = new TreeSet<>();
        Set<Character> blacklist = new HashSet<>();
        
        for(char c : s.toCharArray()) {
            if(blacklist.contains(c)) continue;
            
            if(!tSet.add(c)) {
                blacklist.add(c);
                tSet.remove(c);
            }
        }
        
        for(Character c : tSet) {
            sb.append(c);
        }
        
        return sb.toString();
    }
}