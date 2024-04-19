import java.io.*;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer conversionTokens = new StringTokenizer(br.readLine());
        int future = Integer.parseInt(conversionTokens.nextToken()); // 미래 진법
        int current = Integer.parseInt(conversionTokens.nextToken()); // 현재 진법
        int T = Integer.parseInt(br.readLine()); // 들어올 숫자의 개수
        StringTokenizer numberTokens = new StringTokenizer(br.readLine()); // 숫자들이 적힌 line
        int result = 0; // 미래 진법을 10진법으로 바꾼 값을 담은 변수

        for (int i = T -1; i >=0; i--) {
            int number = (int) (Math.pow(future, i) * Integer.parseInt(numberTokens.nextToken()));
            result += number;
        }

        // 8진법으로 바꿔야지 이제
        StringBuilder sb = new StringBuilder(); // sb로 바꾼다.
        Stack<Integer> stack = new Stack<>();
        while(result > 0) {
            // 8로 나눈 나머지를 sb에 더한다.
//            sb.append(result % current);
            stack.push(result % current);

            // result를 8로 나눈다.
            result /= current;
        }

        while (!stack.isEmpty()) sb.append(stack.pop()).append(" ");

        System.out.println(sb);
    }
}