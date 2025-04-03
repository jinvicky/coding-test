import java.util.*;

import java.util.*;
class Solution {
    public int[] solution(int[] answers) {
        int[] patt1 = new int[]{1,2,3,4,5};
        int[] patt2 = new int[]{2,1,2,3,2,4,2,5};
        int[] patt3 = new int[]{3,3,1,1,2,2,4,4,5,5};
        int maxOCnt = 0; // 최대 맞힌 갯수
        
        int biggest = -999;
        
        // 트리맵을 만들어서 { 맞힌 개수 : 수포자 리스트 }
        TreeMap<Integer, List<Integer>> treeMap = new TreeMap<>();
        
        // 
        int index = 0;
        for(int i = 0; i < answers.length; i++) {
                if(answers[i] == patt1[index]) {
                    maxOCnt++;
                }
                index++;
                if (index == patt1.length) { // 인덱스가 배열 길이와 같아지면 0으로 초기화
                    index = 0;
                }
        }
        
        List<Integer> list1 = treeMap.getOrDefault(maxOCnt, new ArrayList());
        list1.add(1);
        treeMap.put(maxOCnt, list1);
        biggest = Math.max(biggest, maxOCnt);
        index = 0;
        maxOCnt=0;

        
        for(int i = 0; i < answers.length; i++) {
                if(answers[i] == patt2[index]) {
                    maxOCnt++;
                }
                index++;
                if (index == patt2.length) { // 인덱스가 배열 길이와 같아지면 0으로 초기화
                    index = 0;
                }
        }
        List<Integer> list2 = treeMap.getOrDefault(maxOCnt, new ArrayList());
        list2.add(2); // 수포자 2
        treeMap.put(maxOCnt, list2);
        biggest = Math.max(biggest, maxOCnt);

        index =0;
        maxOCnt=0;

        
        for(int i = 0; i < answers.length; i++) {
                if(answers[i] == patt3[index]) {
                    System.out.println("why...");
                    maxOCnt++;
                }
                index++;
                if (index == patt3.length) { // 인덱스가 배열 길이와 같아지면 0으로 초기화
                    index = 0;
                }
        }
         List<Integer> list3 = treeMap.getOrDefault(maxOCnt, new ArrayList());
        list3.add(3); // 수포자 2

        treeMap.put(maxOCnt, list3);
                        biggest = Math.max(biggest, maxOCnt);

        System.out.println(maxOCnt);
        

        List<Integer> ansList = treeMap.get(biggest);
        int[] answer = new int[ansList.size()];
        for(int i = 0; i < ansList.size(); i++) {
            answer[i] = ansList.get(i);
        }
        return answer;
    }
}