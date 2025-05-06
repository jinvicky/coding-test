import java.util.*;
import java.util.stream.Collectors;
import java.io.*;
import java.lang.*;
import java.math.*;

class Solution {
    public int[] solution(String[] id_list, String[] report, int k) {
        int[] answer = new int[id_list.length];
        Map<String, Set<String>> map = new HashMap<>();
        Map<String, Integer> idxMap = new HashMap<>();
        
        for(int i = 0 ; i < id_list.length; i++) {
            String name = id_list[i];
            map.put(name, new HashSet<>());
            idxMap.put(name, i);
        }
        
        for(String s : report) {
            String[] str = s.split(" ");
            String from = str[0];
            String to = str[1];
            map.get(to).add(from);
        }
        
        for(int i = 0; i < id_list.length; i++) {
            Set<String> send = map.get(id_list[i]);
            if(send.size() >= k) {
                for(String name : send) {
                    answer[idxMap.get(name)]++;
                }
            }
        }
        return answer;
    }
}