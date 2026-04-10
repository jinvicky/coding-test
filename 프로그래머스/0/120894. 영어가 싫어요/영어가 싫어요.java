import java.util.*;

class Solution {
    public long solution(String numbers) {
        // 찾을때까지 sb에 계속 더한다. map에서 null이 아닌 값이 나오면 결과 문자열에 append하고 마지막에 
        // 정수형으로 Integer.parseInt하여 리턴한다. 
        
        Map<String, Integer> map = new HashMap<>();
        map.put("zero", 0);
        map.put("one", 1);
        map.put("two", 2);
        map.put("three", 3);
        map.put("four", 4);
        map.put("five", 5);
        map.put("six", 6);
        map.put("seven", 7);
        map.put("eight", 8);
        map.put("nine", 9);
        
        StringBuilder sb = new StringBuilder();
        StringBuilder result = new StringBuilder();
        
        for(char c : numbers.toCharArray()) {
            sb.append(c);
            Integer v = map.get(sb.toString());
            
            if(v != null) {
                result.append(v);
                sb = new StringBuilder();
            }
        }
        
        return Long.parseLong(result.toString());
    }
}