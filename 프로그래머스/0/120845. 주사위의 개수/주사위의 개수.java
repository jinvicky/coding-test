class Solution {
    public int solution(int[] box, int n) {
        int v = box[0];
        int h = box[1];
        int t = box[2];
        
        int answer = 1;
        
        answer *= v / n;
        answer *= h / n;
        answer *= t / n;
        
        System.out.println(answer);
        
        return answer;
    }
}