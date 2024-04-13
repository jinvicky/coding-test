

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine()); // 피연산자 대응값
        String line = br.readLine(); // 후위표기식(알파벳)
        Stack<Double> stack = new Stack<>();

//        Map<Character, Float> map = new HashMap();
//
//        //일단 피연산자 알파벳 배열 초기화
//        for (int i = 0; i < line.length(); i++) {
//            Character character = line.charAt(i);
//            if (N < 1) break;
//            if (isAlpha(character)) {
//                map.put(character, Float.parseFloat(br.readLine()));
//                N--;
//            }
//        }

        Double[] arr = new Double[N];
        for(int j = 0; j < N; j++) {
            arr[j] = Double.parseDouble(br.readLine());
        }

        for (int i = 0; i < line.length(); i++) {
            Character character = line.charAt(i);

            if (isAlpha(character)) {
                stack.push(arr[character - 'A']); //알파벳에 해당하는 숫자 push
            } else {
                Double a = stack.pop();
                Double b = stack.pop();
                stack.push(calculate(b, a, character));
            }
        }
        System.out.printf("%.2f", stack.pop());

    }

    public static boolean isAlpha(Character character) {
        return (character >= 'a' && character <= 'z' || character >= 'A' && character <= 'Z');
    }

    public static Double calculate(Double a, Double b, Character operator) {
        Double result = 0.0;
        switch (operator) {
            case '*':
                result = a * b;
                break;
            case '/':
                result = a / b;
                break;
            case '+':
                result = a + b;
                break;
            case '-':
                result = a - b;
                break;
            default:
                break;
        }
        return result;
    }
}





