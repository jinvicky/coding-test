import java.util.*;

class Solution {
    public String solution(String[] participant, String[] completion) {
        String answer = "";
        
        Map<String, Integer> map = new HashMap<>();
       // map에 참가자들을 저장
        for(String p : participant) {
            int count = map.get(p) == null ? 1 : (int) map.get(p)+1;
            map.put(p, count);
        }
        
        // 완주자들을 map에서 카운터 감소 
        for(String c : completion) {
            int count = (int) map.get(c) -1;
            map.put(c, count);
        }
        
        for(Map.Entry<String, Integer> m : map.entrySet()) {
            if(m.getValue() != 0) {
                return m.getKey();
            }
        }
        
        return answer;
    }
}