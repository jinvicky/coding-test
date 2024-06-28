import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        StringBuilder T = new StringBuilder(br.readLine());
//        StringBuilder S = new StringBuilder(br.readLine());
//
//        long duplicateCnt = 0;
//        while(T.length() > S.length()) {
//            int idx = T.indexOf(S.toString());
//            if(idx != -1) { // 있다.
//                T.delete(idx, idx+S.length());
//                duplicateCnt++;
//            }
//        }
//        System.out.println(duplicateCnt);


        String T = br.readLine();
        String S = br.readLine();

        int TSize = T.length();
        int SSize = S.length();

        T = T.replace(S, "");
        TSize = TSize - T.length();
        System.out.println(TSize /SSize);
    }
}