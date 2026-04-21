class Solution {
    public String solution(String s, int n) {
       // 밀거잖아. (인덱스 + n + 알파벳의 길이 ) % 알파벳의 길이 공식 써봐?
        StringBuilder sb = new StringBuilder();
       for (char c : s.toCharArray()) {
           if(c == ' ') {
               sb.append(' ');
               continue;
           }
           
           char newC = '0';
           
           if(Character.isUpperCase(c)) {
               newC = (char)((c - 'A' + n) % 26 + 'A');
           }else {
               newC = (char)((c - 'a' + n) % 26 + 'a');
           }
           sb.append(newC);
       }
        return sb.toString();
    }
}