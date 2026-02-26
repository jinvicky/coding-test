class Solution {
    public int solution(int n, int t) {
        int loop = t;
        int v = n;
        while(loop > 0) {
            v *= 2;
            loop--;
        }
        return v;
    }
}