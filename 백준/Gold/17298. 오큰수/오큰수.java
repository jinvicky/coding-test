import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

import java.io.*;
import java.util.Stack;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        Stack<Integer> stack = new Stack<>();

        int N = Integer.parseInt(br.readLine());
        int[] result = new int[N];

        String[] tmp = br.readLine().split(" ");

        for(int i = 0; i < N; i++) {
            result[i] = Integer.parseInt(tmp[i]);
        }

        for(int i = 0; i < N; i++) {
            //할것을 다 하고? 민다.
            while(!stack.isEmpty() && result[stack.peek()] < result[i]) {
                //스택이 저장한 주솟값에 존재하는 값이 현재 elem보다 작을 경우
                // 스택의 주솟값을 꺼내서 해당 result[스택의 주솟값]에 현재 elem의 값을 넣는다.
                result[stack.pop()] = result[i];

                //비교의 개념이기는 하나 요소를 a,b를 순차적으로 꺼내서 하는 비교가 아니다. 그래서 틀렸다.
            }
            stack.push(i);
        }

        while(!stack.isEmpty()) {
            int idx = stack.pop();
            result[idx] = -1;
        }

        //마지막으로 출력
        for(int i = 0; i < N; i++) {
            sb.append(result[i]).append(i == N -1 ? "" : " ");
        }

//        for(int i = 0; i < N; i++) {
//            sb.append(result[i]).append(' ');
//        }
        System.out.println(sb);
    }
}