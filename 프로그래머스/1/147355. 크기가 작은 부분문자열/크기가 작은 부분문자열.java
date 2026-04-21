import java.util.*;
class Solution {
    public int solution(String t, String p) {
        //  list를 선언해서 substring한 값을 계속 넣고, 대신 Integer.parseInt한 걸 넣어야지 
        // 마지막에 list를 돌면서 (int) p한 값보다 더 큰 값일 수록 count++하면 될 것 같은데
        int answer = 0;
        
        List<String> list = new ArrayList<>();
        
        for(int i = 0; i <= t.length() - p.length(); i++) {
            list.add(t.substring(i, i + p.length()));
        }
        
        for(String n : list) {
            Long toLong = Long.parseLong(n);
            if(Long.parseLong(p) >= toLong) {
                answer++;
            }
        }
        
        return answer;
    }
}