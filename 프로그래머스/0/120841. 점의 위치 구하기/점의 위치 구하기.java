class Solution {
    public int solution(int[] dot) {
        int x = dot[0];
        int y = dot[1];
        
        if(x < 0) {
            if(y < 0) {
                return 3;
            } else {
                return 2;
            }
        } else {
            if(y < 0) {
                return 4;
            } else {
                return 1;
            }
        }
    }
}