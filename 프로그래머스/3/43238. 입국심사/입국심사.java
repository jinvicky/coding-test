import java.util.*;

class Solution {
    public long solution(int n, int[] times) {
        Arrays.sort(times);

        long left = 1;  // 최소 시간
        long right = (long) times[times.length - 1] * n;
        long answer = right;

        while (left <= right) {
            long mid = (left + right) / 2;

            if (canProcessAll(mid, times, n)) {
                answer = mid;
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return answer;
    }

    private boolean canProcessAll(long timeLimit, int[] times, int n) {
        long count = 0;

        for (int time : times) {
            count += timeLimit / time;
            if (count >= n) return true; // ✅ 조기 종료로 최적화
        }

        return false;
    }
}
