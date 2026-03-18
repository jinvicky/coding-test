class Solution {
    public int solution(int a, int b) {
        String sv = String.valueOf(a) + b;
        return Math.max(2* a* b, Integer.valueOf(sv));
    }
}