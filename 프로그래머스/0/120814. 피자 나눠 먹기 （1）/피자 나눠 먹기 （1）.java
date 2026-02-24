class Solution {
    public int solution(int n) {
        int answer = 0;
        int piece = 7;
        
        if(n <= 7) return 1;
        else {
            int v = 0;
            while(v < n) {
                v += piece;
                answer++;
            }
        }
        return answer;
    }
}