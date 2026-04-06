class Solution {
    public String solution(int age) {
        StringBuilder sb = new StringBuilder();
        
        while(age > 0) {
            int v = age % 10;
            
            sb.append((char)('a' + v));
            
            age /= 10;
        }
        
        // 내가 계산을 역순으로 하니까 reverse() 로직이 필요하다.         
        return sb.reverse().toString();
    }
}