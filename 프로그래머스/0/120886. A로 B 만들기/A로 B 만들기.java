import java.util.*;
import java.util.stream.Collectors;

class Solution {
    public int solution(String before, String after) {
        int answer = 0;
        
      String sortedBefore = before.chars()
        .mapToObj(String::valueOf)
        .sorted()                     
        .collect(Collectors.joining());
        
      String sortedAfter = after.chars()
        .mapToObj(String::valueOf)
        .sorted()
        .collect(Collectors.joining());
        
        

        
        
        
        return sortedBefore.equals(sortedAfter) ? 1 : 0;
    }
}