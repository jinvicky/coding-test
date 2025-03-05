import java.util.Stack;
class Solution {
      public String solution(String number, int k) {
        Stack<Character> stack = new Stack<>();

        for (char c : number.toCharArray()) {
            // stack이 비어있지 않으며, 숫자가 stack의 마지막 값보다 크고 k가 남아있다면
            while (k > 0 && !stack.isEmpty() && stack.peek() < c) {
                stack.pop();  // 작은 값을 제거
                k--;  // 제거된 숫자만큼 k 감소
            }
            stack.push(c);  // 현재 숫자를 스택에 추가
        }

        // k가 아직 남아있다면, 스택에서 남은 숫자들을 제거
        while (k > 0) {
            stack.pop();
            k--;
        }

        // 스택에 남은 숫자들을 결과 문자열로 변환
        StringBuilder sb = new StringBuilder();
        for (char ch : stack) {
            sb.append(ch);
        }

        return sb.toString();
    }
}