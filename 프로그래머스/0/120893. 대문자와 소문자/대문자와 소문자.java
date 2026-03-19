class Solution {
    public String solution(String my_string) {
        StringBuilder sb = new StringBuilder();
        for(char c : my_string.toCharArray()) {
           if(Character.isUpperCase(c)) {
               // 소문자로 변환
               sb.append(Character.toLowerCase(c));
           } else {
               // 대문자로 변환
               sb.append(Character.toUpperCase(c));
           }
        }
        return sb.toString();
    }
}