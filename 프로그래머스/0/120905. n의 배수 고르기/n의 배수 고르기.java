import java.util.*;

class Solution {
    public int[] solution(int n, int[] numlist) {
        // n으로 나누었을 때 나머지가 0인 것 아닌가?
        // 
        List<Integer> list = new ArrayList<>();
        
        for(int num : numlist) {
            if(num % n == 0) list.add(num);
        }
        return list.stream().mapToInt(a->a).toArray();
    }
}