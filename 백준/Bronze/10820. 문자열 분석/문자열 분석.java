import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int[] result = new int[4];
        String str = "";


        while ((str = br.readLine()) != null) {
//        while(br.readLine()) {
            for (int i = 0; i < str.length(); i++) {
                Character ch = str.charAt(i);

                if (ch == ' ') {
                    result[3]++;
                } else if (Character.isDigit(ch)) {
                    result[2]++;
                } else if (ch - 97 >= 0) {
                    result[0]++;
                } else {
                    result[1]++;
                }
            }

            String tmp = "";
            for (int i = 0; i < result.length; i++) {
                tmp += result[i] + " ";
            }
            bw.append(tmp.trim() + "\n");

            //배열 초기화
            result = new int[]{0, 0, 0, 0};
        }

        bw.flush();
        bw.close();
    }
}
