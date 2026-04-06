class Solution {
    public String solution(String rsp) {
        // if문 3개로 이길때 sb.append() 하면 되는 것 아니니?
        StringBuilder sb = new StringBuilder();
        for(char c : rsp.toCharArray()) {
            int v = c- '0';
            
            System.out.println(v);
            
            switch(v){
                case 2: 
                    sb.append(0);
                    break;
                case 0: 
                    sb.append(5);
                    break;
                case 5: 
                    sb.append(2);
                    break;
                default:
                    break;
            }
        }
        
        return sb.toString();
    }
}