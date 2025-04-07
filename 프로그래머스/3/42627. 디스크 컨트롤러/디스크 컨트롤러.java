import java.util.*;

class Solution {
    public int solution(int[][] jobs) {
        int answer = 0;
        
        Arrays.sort(jobs, (a,b) -> a[0] - b[0]);
        PriorityQueue<int[]> pq = new PriorityQueue<>(new Comparator<int[]>() {
           @Override
           public int compare(int[] a, int[] b) {
               return Integer.compare(a[1], b[1]);
           }
        });
        
        int sum = 0;
        int lastT = 0; 
        int index = 0;
        int count = 0;
        
        while(count < jobs.length) {
            while(index < jobs.length && jobs[index][0] <= lastT) {
                pq.offer(jobs[index]);
                index++;
            }
            
            if(!pq.isEmpty()) {
                int[] item = pq.poll();
                
                lastT += item[1];
                int totalTime = lastT - item[0];
                sum += totalTime;
                count++;
            } else {
                lastT = jobs[index][0];
            }
        }
        return sum / jobs.length;
    }
}
