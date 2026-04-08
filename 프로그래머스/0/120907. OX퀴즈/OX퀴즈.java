class Solution {
    public String[] solution(String[] quiz) {
        String[] answer = new String[quiz.length];
        for (int i = 0; i < quiz.length; i++) {
            String[] split = quiz[i].split(" ");
            int x = Integer.parseInt(split[0]);
            int y = Integer.parseInt(split[2]);
            String oper = split[1];
            int expected = Integer.parseInt(split[4]);
            
            if(oper.equals("+")) {
                answer[i] = (x+y == expected) ? "O" : "X";
            } else {
                answer[i] = (x-y == expected) ? "O" : "X";
            }
        }
        return answer;
    }
}