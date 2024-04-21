import java.io.*;
import java.util.Stack;
import java.util.StringTokenizer;


public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int countOfBrother = Integer.parseInt(st.nextToken()); // 동생 수
        int myPosition = Integer.parseInt(st.nextToken()); // 내 위치

        Stack<Integer> stack = new Stack<>();

        int currentPos = myPosition; // 수빈이의 현재 위치
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < countOfBrother; i++) {
            int posOfBrother = Integer.parseInt(st.nextToken());
            // 현재 내 위치 - 동생의 위치를 구한다. (-가 나오지 않도록 절댓값 메서드를 쓴다)
            int distanceDiff = Math.abs(currentPos - posOfBrother);

            stack.push(distanceDiff); // 스택에 거리차 값을 계속 push한다.
            currentPos = posOfBrother; // 수빈이가 동생한테 갔으니 동생 위치로 현재 위치를 바꾼다.
        }

        int gcdResult = 0;

        if (countOfBrother == 1) {
            gcdResult = stack.pop();
        } else if (countOfBrother == 2) {
            gcdResult = recursiveGcd(stack.pop(), stack.pop());
        } else {
            // 동생이 3명 이상인 경우
            int temp = recursiveGcd(stack.pop(), stack.pop());
            while (!stack.isEmpty()) {
                temp = recursiveGcd(temp, stack.pop());
            }
            gcdResult = temp;
        }
        System.out.println(gcdResult);
    }
    public static int gcd (int v1, int v2) {
        while (v2 != 0) {
            int tmp = v1;
            v1 = v2;
            v2 = tmp % v2;
        }
        return v1;
    }

    public static int recursiveGcd (int v1, int v2) {
        int tmp = v1;
        if (v2 == 0) {
            return v1;
        }
        return recursiveGcd(v2, tmp % v2); // b(v2)가 0이 아니면 재귀호출
    }
}