class Solution {
    public int solution(int hp) {
        int top = 5;
        int middle = 3;
        int low = 1;
        
        int answer = 0;
        
        while(hp >= top) {
            answer += hp / top;
            hp = (hp % top);
        }
        
        while (hp >= middle) {
            answer += hp / middle;
            hp %= middle;
        }
        
        while (hp >= low) {
            answer += hp / low;
            hp %= low;
        }
        
        return answer;
    }
}