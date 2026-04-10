class Solution {
    public int solution(int n) {
        int f = 1;
        int total = 1;

        while (total * (f + 1) <= n) {
            f++;
            total *= f;
        }

        return f;
    }
}