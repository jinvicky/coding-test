class Solution {
    public int[] solution(String[] keyinput, int[] board) {
        int[] answer = new int[2];
        
        int limitX = board[0] / 2;
        int limitY = board[1] / 2;
        
        for(int i = 0; i < keyinput.length; i++) {
            int nextX = answer[0];
            int nextY = answer[1];
            
            String dir = keyinput[i];
            
            if(dir.equals("left")) {
                nextX--;
            } else if (dir.equals("right")){
                nextX++;
            } else if (dir.equals("up")){
                nextY++;
            } else if (dir.equals("down")){
                nextY--;
            }
            
            if(Math.abs(nextX) <= limitX && Math.abs(nextY)  <= limitY) {
                answer[0] = nextX;
                answer[1] = nextY;
            }
        
        }
        
        return answer;
    }
}