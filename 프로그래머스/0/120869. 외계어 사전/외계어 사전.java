import java.util.*;
class Solution {
    public int solution(String[] spell, String[] dic) {
        for(int i = 0; i < dic.length; i++) {
            String item = dic[i];
            
            boolean all = false;
            for(String s : spell) {
                if(item.contains(s)) {
                    all = true;
                }else {
                    all = false;
                    break;
                }
                
                System.out.println(all);
            }
            
            if(all) return 1;
        }
        return 2;
    }
}