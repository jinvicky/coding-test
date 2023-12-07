import java.io.*;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String word = br.readLine();
        int[] alpArr = new int[26];

        for(int i = 0; i < alpArr.length; i++) {
            alpArr[i] = -1;
        }

        for(int i = 0; i < word.length(); i++) {
            int ascCode = ((int)word.charAt(i)) - 97;
            if(alpArr[ascCode] == -1) {
                alpArr[ascCode] = i;
            }
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
