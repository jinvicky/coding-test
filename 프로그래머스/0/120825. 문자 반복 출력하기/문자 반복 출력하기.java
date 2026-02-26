class Solution {
    public String solution(String my_string, int n) {
        char[] arr = my_string.toCharArray();
        StringBuilder sb = new StringBuilder();
        
        for(char c : arr) {
            for(int i = 0; i < n; i++) {
                sb.append(c);
            }
        }
        
        
        return sb.toString();
    }
}