import java.util.*;


class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        
        for(int i = 0; i < commands.length; i++) {
            int from = commands[i][0] - 1;
            int to = commands[i][1] ;
            int k = commands[i][2];
            
            int[] subArr = Arrays.copyOfRange(array, from, to);
            Arrays.sort(subArr);
            
            
            
            answer[i] = subArr[k-1];
        }

        return answer;
    }
}