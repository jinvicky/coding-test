class Solution {
    public int solution(String my_string) {
        int digitSum = 0;
        
        for(char c : my_string.toCharArray()) {
            if(Character.isDigit(c)) {
                digitSum += c - '0';
            }
        }
        
        return digitSum;
    }
}