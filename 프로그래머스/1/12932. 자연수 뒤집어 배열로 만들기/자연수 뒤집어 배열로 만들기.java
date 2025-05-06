import java.util.*;
import java.lang.*;
import java.io.*;
import java.math.*;
class Solution {
    public int[] solution(long n) {
        StringBuilder sb = new StringBuilder();
        sb.append(n).reverse();
        
        System.out.println(sb);
        int[] answer = new int[sb.toString().length()];
        
        for(int i = 0; i < sb.toString().length(); i++) {
            int item = sb.charAt(i)- '0';
            answer[i] = item;
        }
        
        return answer;
    }
}