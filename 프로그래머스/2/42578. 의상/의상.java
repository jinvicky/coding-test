import java.util.*;
import java.lang.*;
class Solution {
    public int solution(String[][] clothes) {
        int answer = 1;
        
        Map<String, List<String>> map = new HashMap<>();
        Map<String, Integer> sizeMap = new HashMap<>();
        
        for(String[] pair : clothes) {
            List<String> values = map.getOrDefault(pair[1], new ArrayList<>());
            values.add(pair[0]);
            map.put(pair[1], values);
            sizeMap.put(pair[1], values.size()); // 아이템의 개수만 별도 저장
        }
        
        System.out.println(sizeMap);
        
        int onlyOneItemAnswer = 0;
        
        Iterator<Integer> iterator = sizeMap.values().iterator();
        while(iterator.hasNext()) {
                answer *= iterator.next().intValue() + 1;

            System.out.println(answer);
        }
        
        return answer-1;
    }
}