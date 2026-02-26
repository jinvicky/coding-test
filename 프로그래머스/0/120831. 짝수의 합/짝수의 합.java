class Solution {
    public int solution(int n) {
        int answer = 0;
        
        int val = n;
        
        while(val > 0) {
            if(val % 2 == 0) answer+= val;
            val--;
        }
        return answer;
    }
}