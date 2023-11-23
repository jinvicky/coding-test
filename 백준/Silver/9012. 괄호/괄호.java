import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int length = Integer.parseInt(br.readLine());
        StringBuilder result = new StringBuilder();

        String yn = "";

        for (int i = 0; i < length; i++) {
            StringTokenizer str = new StringTokenizer(br.readLine(), "");
            while (str.hasMoreTokens()) {
                String test = str.nextToken();
                StringBuffer sb = new StringBuffer(test);
                Stack<Character> leftStack = new Stack<Character>();
                Stack<Character> rightStack = new Stack<Character>();

                for(int j = 0; j < test.length(); j++) {
                    char character = test.charAt(j);
                    if(character == '(') { //괄호가 (라면
                        leftStack.push(character);
                    } else {
                        if (!leftStack.isEmpty()) { // 스택이 비지 않았으면 pop인데
                            leftStack.pop();
                        } else {
                            rightStack.push(character);
                        }
                    }
                }
                // yn 여부 파별
                if (leftStack.isEmpty() && rightStack.isEmpty()) {
                    yn = "YES";
                } else yn = "NO";
                result.append(yn + "\n");
            }
        }
        System.out.println(result);
    }
}