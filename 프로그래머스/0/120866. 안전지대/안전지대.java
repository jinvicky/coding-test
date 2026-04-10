class Solution {
    public int solution(int[][] board) {
        int danger = 0;
        int m = board.length;
        int n = board[0].length;
        int[][] visited = new int[m][n];
        
        for(int i = 0; i < m; i++) {
            for(int j = 0; j < n; j++) {
                if (board[i][j] == 1) {
                    visited[i][j] = 1;
                    
                    int[] dx = {-1, -1, -1, 0, 0, 1, 1, 1};
                    int[] dy = {-1, 0, 1, -1, 1, -1, 0, 1};
                    
                    for(int dir = 0; dir < 8; dir++) {
                        int ni = i + dx[dir];
                        int nj = j + dy[dir];
                        
                        if(ni < 0 || nj < 0) continue;
                        if(ni > m - 1 || nj > n-1) continue;
                        
                        visited[ni][nj] = 1;
                    }
                    
                }
            }
        }
        
        for(int i = 0; i < board.length; i++) {
            for(int j = 0; j < board[0].length; j++) {
                if(visited[i][j] ==1) danger++;
            }
        }
        
        return (board.length * board[0].length) - danger;
    }
}