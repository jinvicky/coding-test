
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = 26; //알파벳 배열의 길이
        Character[] lowerArr = new Character[N];
        Character[] upperArr = new Character[N];

        //알파벳 배열 초기화
        for (int i = 0; i < N; i++) {
            int low = 97;
            int upp = 65;

            lowerArr[i] = (char) (i + low);
            upperArr[i] = (char) (i + upp);
        }

        String input = br.readLine();

        for (int i = 0; i < input.length(); i++) {
            Character ch = input.charAt(i);
            int ascCode = 0;

            if (ch - 97 >= 0) { //소문자
                ascCode = (int) (ch - 97);
                int tmp = ascCode + 13 >= N ? Math.abs(N - (ascCode + 13)) : ascCode + 13;
                bw.append(lowerArr[tmp]);
            } else if (ch >= 'A' && ch <= 'Z') { //대문자
                ascCode = (int) (ch - 65);
                int tmp = ascCode + 13 >= N ? Math.abs(N - (ascCode + 13)) : ascCode + 13;
                bw.append(upperArr[tmp]);
            } else { // 빈 공백일 경우 그대로 더한다.
                bw.append(ch);
            }
        }
        bw.flush();
        bw.close();
    }
}
