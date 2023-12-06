import java.io.*;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String line = br.readLine();

        Stack<Character> stack = new Stack<>();
        Queue<Character> queue = new LinkedList<>();

        boolean flag = false;
        for (int i = 0; i < line.length(); i++) {
            char ch = line.charAt(i);

            if (ch == '<') { //태그 열기 시작한 경우
                flag = true; //<시작
                if (!stack.isEmpty()) { //닫는 <태그
                    while (stack.size() > 0) {
                        bw.append(stack.pop());
                    }
                }
                bw.append(ch);

            } else if (ch == '>') {
                flag = false;
                if (!queue.isEmpty()) {
                    while (queue.size() > 0) {
                        bw.append(queue.poll());
                    }
                }
                bw.append(ch);
            } else {
                if (flag) queue.add(ch);
                else { //simple text
                    if (ch == ' ') {
                        while(stack.size() > 0) {
                            bw.append(stack.pop());
                        }
                        bw.append(ch);
                    } else {
                        stack.push(line.charAt(i));
                    }
                }
            }
        }

        if(!stack.isEmpty()) {
            while(stack.size() > 0) {
                bw.append(stack.pop());
            }
        }

        bw.flush();
        bw.close();
    }
}
