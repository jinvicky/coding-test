class Solution {
    public int[] solution(int brown, int yellow) {
        int[] answer = new int[2];
        
        // 최소 격자는 3이어야 yellow가 들어간다. 
        for(int i = 3; i < brown + yellow; i++) {
            int width = (brown+ yellow) / i;
            boolean pass = (i-2) * (width-2) == yellow;
            if(width >= i && pass) {
                answer[0] = width;
                answer[1] = i;
                
                break;
            }
        }
        return answer;
    }
}