class Solution {
    public int solution(String my_string) {
       // 숫자가 아니면 더하지 않는다. 
       // 숫자라면 다음이 숫자가 아닐 때까지 sb를 사용해서 합친 후 더한다. 
       // 마지막에 sb가 남아있는지 확인하고 남아 있으면 더한다. 
        
       StringBuilder sb = new StringBuilder();
       int total = 0;
       for(char c : my_string.toCharArray()) {
           if(!Character.isDigit(c)) {
               // 기존 sb를 total에 더하기 
               if(sb.length() > 0) {
                    total += Integer.parseInt(sb.toString());
               }
               // sb 초기화
               sb = new StringBuilder();
               continue;
           }
           sb.append(c);
       }
    
        if(sb.length() > 0) total += Integer.parseInt(sb.toString());
        
       return total;
    }
}