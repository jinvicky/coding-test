import java.util.*;
import java.lang.*;

class Solution {
    public boolean solution(String[] phone_book) {
        boolean answer = true;
        String fStr = phone_book[0];
        
        String concat = "";
        Map<String, Integer> map = new HashMap<>();
        
        for(int i = 0; i < phone_book.length; i++) {
            map.put(phone_book[i], 1);
        }
        
        for(int i = 0; i < phone_book.length; i++) {
            for(int j = 0; j < phone_book[i].length(); j++) {
                String everyKey = phone_book[i].substring(0, j);
                if(map.containsKey(everyKey)) {
                    return false;
                }
            }
        }
        return answer;
    }
}