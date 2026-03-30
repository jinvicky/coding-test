class Solution {
    public int solution(int slice, int n) {
       // 최소 1조각씩은 먹어야해! 
        return n % slice == 0 ? n / slice : n / slice + 1;
    }
}