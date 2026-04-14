import java.util.*;
class Solution {
    public long solution(long n) {
        // 나라면 버블정렬인가? 그런 류의 정렬을 써볼 것 같은데?
        // 근데 버블정렬 공식 모름. 그래서 문자열로 만들고 정렬한다음에 다니 long으로 파싱?
        long answer = 0;
        
        char[] chArr = String.valueOf(n).toCharArray();
        Arrays.sort(chArr);
        return Long.parseLong(new StringBuilder().append(new String(chArr)).reverse().toString());
    }
}