import java.util.*;

class Solution {
    public String[] solution(String my_str, int n) {
        // 0. 현재 길이가 n 이상인지 확인한다. n보다 길이가 작다면 그냥 리턴한다. 
        if(my_str.length() < n){
            return new String[]{my_str};
        }
       
        List<String> list = new ArrayList<>();
        
        while(!my_str.isEmpty()) {
            if(my_str.length() < n) {
                list.add(my_str);
                break;
            } else {
                list.add(my_str.substring(0, n));
                my_str = my_str.substring(n, my_str.length());
            }
        }
        
        System.out.println(list);
        
        return list.toArray(new String[0]);    
    }
}