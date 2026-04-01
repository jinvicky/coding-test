import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        for(int i = 0; i < n; i++) {
            StringBuilder sb = new StringBuilder();
            for(int j = 0; j < n; j++) {
                if(i >= j) {
                    sb.append("*");
                }
            }
            System.out.println(sb.toString());
            sb = new StringBuilder();
        }
    }
}