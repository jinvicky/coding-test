
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    static int R,C;

    static char[][] map;

    static int cnt;

    static StringTokenizer st;

    static int[][] dir = {{-1, 1}, {0,1}, {1,1}};

    static boolean[][] visited;

    static boolean flag;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        st = new StringTokenizer(br.readLine());
        R = Integer.parseInt(st.nextToken());
        C = Integer.parseInt(st.nextToken());

        map = new char[R][C];
        visited = new boolean[R][C];
        cnt = 0;

        for (int i = 0; i < R; i++) {
            String str = br.readLine();
            for (int j = 0; j < C; j++) {
                map[i][j] = str.charAt(j);
            }
        }

        for (int i = 0; i < R; i++) {
            // 0부터 R-1행까지
            flag = false;
            dfs(i, 0);
        }
        System.out.println(cnt); // 최종 결과 출력

    }
    private static void dfs(int r, int c) {
        if(c== C-1) {
            cnt++;
            flag = true;
            visited[r][c] = true;
            return;
        }

        for(int d = 0; d < 3; d++) {
            int dr = r + dir[d][0];
            int dc = c + dir[d][1];
            if(isOkay(dr, dc) && !visited[dr][dc] && map[dr][dc] == '.') {
                dfs(dr, dc);
                if(flag) {
                    visited[r][c] = true;
                    return;
                }
            } else {
                visited[r][c] = true;
            }
        }
    }

    private static boolean isOkay(int r, int c) {
        return r >= 0 && c >= 0 && r < R && c < C;
    }
}
