import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int k = Integer.parseInt(br.readLine());
        int n = 1;
        int count = 0;

        while(n<k) n= n*2;

        StringBuilder sb= new StringBuilder();
        sb.append(n).append(" ");

        while(k>0){ //원하는 초코값이 0보다 클 동안
            if(k>=n){ // 원하는 초코값이 구매한 초코값보다 크면 => 원한 초코 - 구한 초코
                k-=n; // 6-4= 2 => 2개의 초코가 더 필요함.
//                System.out.println(k);
            }else{
                n/=2; // 구한 초코 / 2
                count++; // 컷팅 횟수 추가
//                System.out.println("나누기" + n); // 그래서 나눔
            }
        }
        // 원하는 초코값을 0으로 만드는 과정
        /**
         * 
         */

        sb.append(count);
        System.out.println(sb);
    }
}