import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String word = br.readLine();
        int[] alpArr = new int[26];

        for(int i = 0; i < alpArr.length; i++) {
            alpArr[i] = 0;
        }

        for(int i = 0; i < word.length(); i++) {
            int ascCode = ((int)word.charAt(i)) - 97;
            int wordIdx = i; // 문자열 단어 내 순서
            char ch = word.charAt(i);

            alpArr[ascCode]++;

//            if(alpArr[ascCode] == -1) {
//                alpArr[ascCode] = i;
//            }
//            System.out.println("i = "+wordIdx +", idx = " + ascCode + ", " + ch);
        }

        String result = "";
        for(int i = 0; i < alpArr.length; i++) {
            result += alpArr[i] + " ";
        }

        bw.append(result.trim());
        bw.flush();
        bw.close();
    }
}