class Solution {
    public int solution(int[] sides) {
        int min = Math.min(sides[0], sides[1]); // 나머지 한 변이 제일 길 때 최소는 min 초과여야함.
        int max = Math.max(sides[0], sides[1]);
        
        // 나머지 한변이 제일 긺
        int caseB = max - min;
        
        return (sides[0] + sides[1] - 1) - caseB;
    }
    
}