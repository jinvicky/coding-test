import java.util.*;

class Solution {
    public int solution(int[] nums) {
        int answer = 0;
        
        //1. 모든 포켓몬 종류를 키로 저장하기 
        Map<Integer, Integer> map = new HashMap<>();
        for(int n : nums) {
            int v = map.getOrDefault(n, 1);
            map.put(n, v);
        }
        
        int max = nums.length / 2;
        
        return max < map.size() ? max : map.size();
    }
}