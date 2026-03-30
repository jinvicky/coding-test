import java.util.*;

class Solution {
    public int[] solution(int[] numlist, int n) {
        Arrays.sort(numlist);
        TreeMap<Integer, List<Integer>> tMap = new TreeMap<>();
        List<Integer> arrayList = new ArrayList<>();
        
        for(int num : numlist) {
            int distance = Math.abs(n - num);
            List<Integer> list = tMap.getOrDefault(distance, new ArrayList<>());
            list.add(num);
            tMap.put(distance, list);
        }
        
        for(Map.Entry<Integer, List<Integer>> entry : tMap.entrySet()) {
            List<Integer> values = entry.getValue();
            for(int i = values.size() - 1; i >= 0; i--) {
                arrayList.add(values.get(i));
            }
        }
        
        return arrayList.stream().mapToInt(a->a).toArray();
    }
}