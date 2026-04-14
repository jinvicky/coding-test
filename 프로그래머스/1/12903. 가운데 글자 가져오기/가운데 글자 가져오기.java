class Solution {
    public String solution(String s) {
        // 중간 인덱스를 구하겠어 (이분탐색의 MID를 구하듯이)
        // %2 ==0 이면 중간 인덱스와 그 뒤, 아니면 중간 인덱스의 문자만 반환하겠어. 
        int left = 0; 
        int right = s.length() - 1;
        int mid = left  + (right - left ) / 2;
        
        return (s.length() %2 == 0) ? s.substring(mid, mid+2) : s.substring(mid, mid+1);
    }
}