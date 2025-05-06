import java.io.*;
import java.lang.*;
import java.lang.*;
import java.math.*;
class Solution {
    public String solution(String s) {
        StringBuilder sb = new StringBuilder();
        
        int p = 0;
        for(char c : s.toCharArray()) {
            if(c == ' ')  {
                sb.append(c);
                p = 0;
                continue;
            }
            
            if(p % 2 == 0) { // 짝수니 대문자
                sb.append(Character.toUpperCase(c));
            } else { // 홀수니 소문자로 변환해서 출력
                sb.append(Character.toLowerCase(c));
            }
            p++;
        }
        
        return sb.toString();
    }
}