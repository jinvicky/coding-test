class Solution {
    public int[] solution(int num, int total) {
        
        for (int start = -1000; start <= 1000; start++) {
            int sum = 0;
            
            // num개 더하기
            for (int i = 0; i < num; i++) {
                sum += (start + i);
            }
            
            // 맞으면 배열 생성
            if (sum == total) {
                int[] answer = new int[num];
                
                for (int i = 0; i < num; i++) {
                    answer[i] = start + i;
                }
                
                return answer;
            }
        }
        
        return null;
    }
}