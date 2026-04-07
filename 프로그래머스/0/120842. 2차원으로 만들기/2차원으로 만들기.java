class Solution {
    public int[][] solution(int[] num_list, int n) {
        int[][] answer = new int[num_list.length / n][n];
        
        for(int i = 0; i < num_list.length / n; i++) {
            int[] part = new int[n];
            for(int j = 0; j < n; j++) {
                int idx = i * n + j;
                part[j] = num_list[idx];
            }
            answer[i] = part;
        }
        
        return answer;
    }
}