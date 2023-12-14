import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        String str = br.readLine();
        Stack<Character> stack = new Stack<>();

        Map<Character, Integer> map = new HashMap(); //우선순위 store
        map.put('(', 0); //미추가시 NullPointerException
        map.put(')', 0); //미추가시 NullPointerException
        map.put('+', 1);
        map.put('-', 1);
        map.put('*', 2);
        map.put('/', 2); // */가 +-보다 우선순위 값이 더 커야 한다.

        for (int i = 0; i < str.length(); i++) {
            char currentChar = str.charAt(i);

            if (currentChar >= 'a' && currentChar <= 'z' || currentChar >= 'A' && currentChar <= 'Z') {
                sb.append(currentChar);
            } else if (currentChar == '(') {
                stack.add(currentChar);
            } else if (currentChar == ')') {
                while (!stack.isEmpty() && stack.peek() != '(') {
                    sb.append(stack.pop());
                }
                stack.pop(); //마지막으로 (를 pop()
            } else { // 사칙연산자.
                while(!stack.isEmpty() && map.get(stack.peek()) >= map.get(currentChar)) {
                    sb.append(stack.pop());
                }
                stack.add(currentChar);
            }
        }

        while (!stack.isEmpty()) {
            sb.append(stack.pop());
        }

        System.out.println(sb.toString());
    }

}