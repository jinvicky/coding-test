class Solution {
    public int solution(String my_string) {
       char[] arr = my_string.toCharArray();
    
        int total = 0;
        StringBuilder temp = new StringBuilder();
        char oper = ' ';
        
       for(int i = 0; i < arr.length; i++) {
           if(Character.isDigit(arr[i])) { // 숫자라면 그냥 더한다. 
               temp.append(arr[i]);
           } else if (arr[i] == ' ') {
               if(temp.length() == 0) continue;
               
               int v = Integer.parseInt(temp.toString());
               if (oper == ' ') {
                   total = v;
               } else {
                   if(oper == '+') {
                       total += v;
                   } else { // '-'라는 뜻이다. 
                       total -= v;
                   }
               }
               temp = new StringBuilder();
           } else {
               oper = arr[i]; // 연산자를 저장한다. 
           }
       }
        
        System.out.println(temp);
        
        if(temp.length() > 0) {
            int v = Integer.parseInt(temp.toString());
            
            if(oper == ' ') total = v;
            else if (oper == '+') total += v;
            else total -= v;
        }
        
        return total;
    }
}