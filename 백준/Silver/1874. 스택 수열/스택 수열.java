import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder result = new StringBuilder(); // 결과문자열

        Stack<Integer> stackA = new Stack<Integer>(); //스택

        int length = Integer.parseInt(br.readLine()); // 수열 라인 수

        int cnt = 0;

        while (length-- > 0) {

            int inputNum = Integer.parseInt(br.readLine());

            if (inputNum > cnt) {
                for (int k = cnt + 1; k <= inputNum; k++) {
                    stackA.push(k);
                    result.append("+\n");
                }
                cnt = inputNum;
            }
            if (stackA.peek() != inputNum)  { //그냥 바로 빠져나가네
                System.out.println("NO");
                return; 
            }

            stackA.pop();
            result.append("-\n");
        }
        System.out.println(result);
    }
}