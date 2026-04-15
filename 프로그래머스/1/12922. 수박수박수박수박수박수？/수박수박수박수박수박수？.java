class Solution {
    public String solution(int n) {
        // n % 2 == 0이 면 수박으로 끝나고 아니면 수로 끝난다. 
        // n / 2 만큼 수박을 더하고 홀수면 수를 더하면 되지 않을까?
        
        int repeat = n / 2;
        StringBuilder sb = new StringBuilder();
        
        while(repeat > 0) {
            sb.append("수박");
            repeat--;
        }
        return n % 2 == 0 ? sb.toString() : sb.append("수").toString();
    }
}