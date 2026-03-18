class Solution {
    
    // 0의 개수 세는 함수 countZero 선언하기 
    private int countZero(String s) {
        int count = 0;
        
        for(char c : s.toCharArray()) {
            if(c == '0') count++;
        }
        
        return count;
    }
    public int[] solution(String s) {
        int[] answer = {};
        
        int loop = 0;
        int zeroCount = 0;
        
        // s가 1이 될 때까지!! 
        while(!s.equals("1")) {
            int zCount = countZero(s);
            
            loop+=1;
            zeroCount += zCount;
            
            int ones = s.length() - zCount; // 문자열의 길이 - 0의 개수
            s = Integer.toString(ones, 2); // 다시 이진수로 변환해서 문자열에 셋팅
        }
        
        
        return new int[] { loop, zeroCount};
    }
}