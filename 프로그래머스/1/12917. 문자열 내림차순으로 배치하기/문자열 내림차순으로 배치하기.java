import java.util.*;
class Solution {
    public String solution(String s) {
        char[] arr = s.toCharArray();
        Arrays.sort(arr);              // 오름차순
        return new StringBuilder(new String(arr)).reverse().toString();
    }
}
