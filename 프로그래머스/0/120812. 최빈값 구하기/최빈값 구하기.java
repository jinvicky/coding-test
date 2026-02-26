import java.util.*;

class Solution {
    public int solution(int[] array) {
        if (array.length == 1) return array[0];

        Map<Integer, Integer> map = new HashMap<>();

        // 1. 빈도수 카운트
        for (int a : array) {
            map.put(a, map.getOrDefault(a, 0) + 1);
        }

        int maxCount = 0;
        int answer = -1;
        boolean isDuplicate = false;

        // 2. 최빈값 찾기
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            int key = entry.getKey();
            int count = entry.getValue();

            if (count > maxCount) {
                maxCount = count;
                answer = key;
                isDuplicate = false; // 새로 갱신되면 중복 아님
            } else if (count == maxCount) {
                isDuplicate = true;  // 최댓값이 또 등장
            }
        }

        return isDuplicate ? -1 : answer;
    }
}