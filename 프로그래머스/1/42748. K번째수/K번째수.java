import java.util.*;

class Solution {
    public int[] solution(int[] array, int[][] commands) {
        List<Integer> ansList = new ArrayList<>();
        
        
        for(int i = 0; i < commands.length; i++) {
            int[] sliced = Arrays.copyOfRange(array, commands[i][0]-1 , commands[i][1]);
            Arrays.sort(sliced);

            ansList.add(sliced[commands[i][2] - 1]);
        }
        
        // commands[i][2] 번째 수를 ansList에 넣기
        
        
        
        
        
        // 정답 리스트를 배열로 변환해서 리턴한다. 
        int[] answer = ansList.stream()
                .mapToInt(Integer::intValue)
                .toArray();

        return answer;
    }
}