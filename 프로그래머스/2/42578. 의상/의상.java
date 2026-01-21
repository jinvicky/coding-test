import java.util.*;
import java.lang.*;
class Solution {
    public int solution(String[][] clothes) {
        Map<String, Integer> map = new HashMap<>();
        
        for(int i = 0; i < clothes.length; i++) {
             String[] item = clothes[i];

            map.putIfAbsent(item[1], 0);
            map.put(item[1], map.get(item[1]) + 1);
        }
                        
        System.out.println(map);
        
        int answer = 1;
        
        for(Map.Entry<String, Integer> entry : map.entrySet()) {
            answer *= (entry.getValue() + 1);
        }
        
        return answer - 1;
    }
}