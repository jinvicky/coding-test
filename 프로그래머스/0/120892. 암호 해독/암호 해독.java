class Solution {
    public String solution(String cipher, int code) {
        // 인덱스가 0일 때 1번째 글자라고 간주하더라. 
        StringBuilder sb = new StringBuilder();
        int idx = code - 1;
        for(int i = 0; i < cipher.length(); i++) {
            if(idx >= cipher.length()) return sb.toString();
            sb.append(cipher.charAt(idx));
            idx += code;
            
            System.out.println(idx);
        }
        
        return sb.toString();
    }
}