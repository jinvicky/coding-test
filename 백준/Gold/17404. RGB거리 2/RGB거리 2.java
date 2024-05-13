import java.io.IOException;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
       Scanner sc = new Scanner(System.in);
       int n = sc.nextInt();
       int[][]list = new int[n+1][n+1]; // 페인트 칠 전체 비용 리스트
       int[][]dp = new int[n+1][n+1]; // 칠한 집 idx를 담은 dp[2][1]은 집 2개의 마지막집을 초록색으로 칠했을 때 드는 최소 비용
       int[]paint = new int[n+1]; // 최소비용

        // 일단 배열 초기화
        for(int i=1;i<=n;i++) {
            for (int j = 0; j < 3; j++) {
                list[i][j] = sc.nextInt();
            }
        }

       // 첫번째 집 칠하기
       for(int i = 0; i < 3; i++) {
           for(int j = 0; j < 3; j++) {
               if (i==j) {
                   dp[1][j] = list[1][j];
               } else {
                     dp[1][j] = 1001;
               }
               /**
                *  dp = [
                *   [0, 0, 0],
                *   [26, 1001, 1001],
                *   [1001, 40, 1001],
                *   [1001, 1001, 83]
                * ]
                */
           }

           for (int k = 2; k < n + 1; k++) {
               int prevHouse = k - 1;

               dp[k][0] = list[k][0] + Math.min(dp[prevHouse][prevHouseList(0).get(0)], dp[prevHouse][prevHouseList(0).get(1)]); // red면 이전 집은 green, blue
//               dp[k][0] = list[k][0] + Math.min(dp[prevIndex][1], dp[prevIndex][2]); // red면 이전 집은 green, blue
               dp[k][1] = list[k][1] + Math.min(dp[prevHouse][prevHouseList(1).get(0)], dp[prevHouse][prevHouseList(1).get(1)]); // green
//               dp[k][1] = list[k][1] + Math.min(dp[prevIndex][0], dp[prevIndex][2]); // green
               dp[k][2] = list[k][2] + Math.min(dp[prevHouse][prevHouseList(2).get(0)], dp[prevHouse][prevHouseList(2).get(1)]); // blue
//               dp[k][2] = list[k][2] + Math.min(dp[prevIndex][0], dp[prevIndex][1]); // blue
               
               if (k==n) {
                   paint[i] = Math.min(dp[n][prevHouseList(i).get(0)], dp[n][prevHouseList(i).get(1)]);
//                   if (i==0) {
//                       paint[i] = Math.min(dp[n][prevHouseList(i).get(0)], dp[n][prevHouseList(i).get(1)]);
//                   }
//                   if (i==1) {
//                       paint[i] = Math.min(dp[n][prevHouseList(i).get(0)], dp[n][prevHouseList(i).get(1)]);
//                   }
               }
           }
       }

        System.out.println(Math.min(paint[0], Math.min(paint[1], paint[2])));
    }
   static List<Integer> prevHouseList (int house) {
       if (house == 1) { // green
           return List.of(0, 2);
       } else if (house == 2) { // blue
           return List.of(0, 1);
       } else { // red
           return List.of(1, 2);
       }
   }
}
