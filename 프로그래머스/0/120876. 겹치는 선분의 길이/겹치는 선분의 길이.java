class Solution {
    public int solution(int[][] lines) {
        int answer = 0;

        answer += overlap(lines[0], lines[1]);
        answer += overlap(lines[0], lines[2]);
        answer += overlap(lines[1], lines[2]);

        // 3개 다 겹친 구간은 2번 더해졌으므로 한 번 빼줌
        int triple = tripleOverlap(lines);
        answer -= triple * 2;

        return answer;
    }

    private int overlap(int[] a, int[] b) {
        int start = Math.max(a[0], b[0]);
        int end = Math.min(a[1], b[1]);
        return Math.max(0, end - start);
    }

    private int tripleOverlap(int[][] lines) {
        int start = Math.max(Math.max(lines[0][0], lines[1][0]), lines[2][0]);
        int end = Math.min(Math.min(lines[0][1], lines[1][1]), lines[2][1]);
        return Math.max(0, end - start);
    }
}