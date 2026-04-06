import java.util.*;

class Solution {
    public String solution(String letter) {
        Map<String, Character> map = new HashMap<>();

    String[] morse = {
        ".-","-...","-.-.","-..",".","..-.",
        "--.","....","..",".---","-.-",".-..",
        "--","-.","---",".--.","--.-",".-.",
        "...","-","..-","...-",".--","-..-",
        "-.--","--.."
    };

    for (int i = 0; i < morse.length; i++) {
        map.put(morse[i], (char) ('a' + i));
    }

    String[] partition = letter.split(" ");
    StringBuilder sb = new StringBuilder();
    for (int i = 0; i < partition.length; i++) {
        sb.append(map.get(partition[i]));
    }
        
    return sb.toString();
   }
}