import java.util.*;

class Solution {
    public int solution(String[] babbling) {
        int answer = 0;
        
        for(String b : babbling) {

           b = b.replace("aya", " ");
b = b.replace("ye", " ");
b = b.replace("woo", " ");
b = b.replace("ma", " ");
            
                if(b.trim().isEmpty()) {
                    answer++;
                } 
                
        }
        
        return answer;
    }
}