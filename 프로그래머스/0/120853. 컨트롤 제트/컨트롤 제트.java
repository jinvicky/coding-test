class Solution {
    public int solution(String s) {
        int recent = 0;
        int sum = 0;
        
        for(String str : s.split(" ")) {
            if(str.equals("Z")) {
                sum -= recent;
                continue;
            }
            int now = Integer.parseInt(str);
            sum += now;
            recent = now;
        }
        
        return sum;
    }
}