class Solution {
    public int solution(int num, int k) {
        String str = String.valueOf(num);
        
        return str.indexOf(String.valueOf(k)) == -1 ? -1: str.indexOf(String.valueOf(k)) + 1;
    }
}