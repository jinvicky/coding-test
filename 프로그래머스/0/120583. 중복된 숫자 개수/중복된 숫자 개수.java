import java.util.*;

class Solution {
    public int solution(int[] array, int n) {
        int answer = 0;
        Map<Integer, Integer> map = new HashMap<>();
        
        for (int num : array) {
            int v = map.getOrDefault(num, 0);
            map.put(num, v+1);
        }
        
        return map.getOrDefault(n, 0);
    }
}