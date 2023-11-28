import java.io.*;
import java.util.Stack;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String str = br.readLine();
        int N = Integer.parseInt(br.readLine());

        Stack<Character> leftStack = new Stack<>();
        Stack<Character> rightStack = new Stack<>();

        for (int i= 0; i < str.length(); i++) {
            leftStack.push(str.charAt(i));
        }

        for (int i = 1; i <= N; i++) {
            String line = br.readLine();
            switch (line.charAt(0)) {
                case 'P':
                    char param = line.charAt(line.length() - 1); //ok
                    leftStack.push(param);
                    break;

                case 'L':
                    //왼쪽으로 커서를 이동, left top을 right에 push
                    if (!leftStack.isEmpty())
                        rightStack.add(leftStack.pop());
                    break;

                case 'D':
                    //오른쪽으로 커서를 이동, right top을 left에 push
                    if (!rightStack.isEmpty())
                        leftStack.push(rightStack.pop());
                    break;

                case 'B':
                    if (!leftStack.isEmpty())
                        leftStack.pop();
                    break;
                default:
                    break;
            }
        }
        while(!leftStack.isEmpty())
            rightStack.add(leftStack.pop());

        while(!rightStack.isEmpty())
            bw.write(rightStack.pop());

        bw.flush();
        bw.close();
    }
}