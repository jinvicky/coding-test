import java.util.*;
class Solution {
    public int solution(int[] numbers) {
        int total = 0;
        
        // 1. set에 numbers를 모두 넣는다. 
        Set<Integer> set = new HashSet<>();
        for(int n : numbers){
            set.add(n);
        }
        
        // 2. 0부터 numbers의 길이만큼 i를 돌리는데 set에 없으면 total에 더한다. 
        for(int i = 0; i <= 9; i++) {
            if(set.contains(i)) continue;
            total += i;
        }
        
        
        
        return total;
    }
}