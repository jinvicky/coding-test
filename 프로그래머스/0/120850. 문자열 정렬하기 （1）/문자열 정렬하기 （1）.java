import java.util.*;
class Solution {
    public int[] solution(String my_string) {
        // 문자 배열을 정렬한 다음에 Character.isDigit()이 아니면 바로 return?
        
        char[] arr = my_string.toCharArray();
        
        Arrays.sort(arr);
        
        List<Integer> list = new ArrayList<>();
        
        for(char c : arr) {
            if(Character.isDigit(c)) {
                list.add(c - '0');
            }else {
                break;
            }
        }
        
        return list.stream().mapToInt(a -> a).toArray();
        
    }
}