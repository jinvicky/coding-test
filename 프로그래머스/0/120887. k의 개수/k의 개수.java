class Solution {
    public int solution(int i, int j, int k) {
        int answer = 0;
        
        for (int t = i; t <=j; t++) {
            String st = Integer.toString(t);
            String sk = Integer.toString(k);
            
            if(st.contains(sk)) { // 11 같은 케이스는 += 2여야 함. 
               for(int h= 0; h < st.length(); h++) {
                   if(st.charAt(h) == (char)(k + '0')) {
                       answer++;
                   }
               }
            }
        }
        return answer;
    }
}