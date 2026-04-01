import java.util.*;
class Solution {
    public int[] solution(int[] numbers, String direction) {
        List<Integer> list = new ArrayList<>();
        for(int i = 0; i < numbers.length; i++) {

            int v = (direction.equals("left")) ? 1 : - 1;
            list.add(numbers[(i+v + numbers.length) % numbers.length]);
            
        }
       return list.stream().mapToInt(a->a).toArray();
    }
}