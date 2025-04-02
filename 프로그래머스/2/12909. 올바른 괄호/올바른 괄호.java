import java.util.*;
class Solution {
    boolean solution(String s) {
        boolean answer = true;
        
        Stack<Character> stack = new Stack<>();
        
        for(char c : s.toCharArray()) {
            if(stack.isEmpty()) stack.push(c);
            else {
                if (stack.peek() == '(' && c == ')') {
                    stack.pop();
                } else {
                    
                    
                    stack.push(c);
                }
                // 조건이 또 있는데 뭐였지....
                
                
            }
        }
        

    
        return stack.isEmpty();
    }
}