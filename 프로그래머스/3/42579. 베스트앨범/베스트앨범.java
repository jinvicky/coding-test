import java.util.*;
import java.lang.*;

class Solution {
    public int[] solution(String[] genres, int[] plays) {
        
        Map<String, Integer> genreTotal = new HashMap<>();
        Map<String, List<int[]>> genreSongs = new HashMap<>();
        
        for(int i = 0; i < genres.length; i++) {
            genreTotal.put(genres[i], 
                          genreTotal.getOrDefault(genres[i], 0) + plays[i]);
            
            genreSongs
                .computeIfAbsent(genres[i], k -> new ArrayList<>())
                .add(new int[]{i, plays[i]});
        }
        
        List<String> genreOrder = new ArrayList<>(genreTotal.keySet());
        genreOrder.sort((a,b) -> genreTotal.get(b) - genreTotal.get(a));
        
        List<Integer> answer = new ArrayList<>();
        
        for (String genre : genreOrder) {
            List<int[]> songs = genreSongs.get(genre);
            
            songs.sort((a,b) -> {
                if(b[1] != a[1]) return b[1] - a[1];
                return a[0] - b[0];
            });
            
            answer.add(songs.get(0)[0]);
            if(songs.size() > 1) {
                answer.add(songs.get(1)[0]);
            }
        }
        
        return answer.stream().mapToInt(i -> i).toArray();
    }
}