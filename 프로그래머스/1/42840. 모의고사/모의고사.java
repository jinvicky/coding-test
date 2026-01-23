import java.util.*;

import java.util.*;
class Solution {
    public int[] solution(int[] answers) {
        int[] patt1 = new int[]{1,2,3,4,5};
        int[] patt2 = new int[]{2,1,2,3,2,4,2,5};
        int[] patt3 = new int[]{3,3,1,1,2,2,4,4,5,5};
        
        // 점수 배열 
        int[] scores = new int[3];
        
        // 이중 for문으로 scores 업데이트 
        for(int i = 0; i < answers.length; i++) {
    if(answers[i] == patt1[i % patt1.length]) scores[0]++;
    if(answers[i] == patt2[i % patt2.length]) scores[1]++;
    if(answers[i] == patt3[i % patt3.length]) scores[2]++;

        }
        
        List<Integer> ansList = new ArrayList<>();
        // 최대 정답의 개수 구하기 
        int max = Math.max(scores[0], Math.max(scores[1], scores[2]));
        
        // max와 동일하면 +1해서 리스트에 추가하기 
        for(int i = 0; i <scores.length; i++){
            if(max == scores[i]) {
                ansList.add(i+1);
            }
        }
        
        return ansList.stream()
            .mapToInt(i -> i).toArray();
    }
}