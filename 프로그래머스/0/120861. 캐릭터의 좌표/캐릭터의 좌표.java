class Solution {
    public int[] solution(String[] keyinput, int[] board) {
        int[] answer = new int[2];
        
        int limitX = board[0] / 2;
        int limitY = board[1] / 2;
        
        for (int i = 0; i < keyinput.length; i++) {
            int nextX = answer[0];
            int nextY = answer[1];
            
            switch (keyinput[i]) {
                case "left": nextX--; break;
                case "right": nextX++; break;
                case "up": nextY++; break;
                case "down": nextY--; break;
            }
            
            if (Math.abs(nextX) <= limitX && Math.abs(nextY) <= limitY) {
                answer[0] = nextX;
                answer[1] = nextY;
            }
        }
        
        return answer;
    }
}