import java.util.*;

class Solution {
    public int solution(int distance, int[] rocks, int n) {
        Arrays.sort(rocks);

        int left = 1;
        int right = distance;
        int answer = 0;

        while (left <= right) {
            int mid = (left + right) / 2;
            int removed = 0;
            int prev = 0;  // 출발점

            for (int rock : rocks) {
                if (rock - prev < mid) {
                    removed++;  // 제거
                } else {
                    prev = rock;
                }
            }

            // 마지막 도착지점 체크
            if (distance - prev < mid) {
                removed++;
            }

            if (removed > n) {
                // 너무 많이 제거 → 거리 줄여야 함
                right = mid - 1;
            } else {
                // 가능함 → 더 크게 도전
                answer = mid;
                left = mid + 1;
            }
        }

        return answer;
    }
}