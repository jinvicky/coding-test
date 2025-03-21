import java.util.*;
import java.lang.*;
import java.math.*;
import java.io.*;

class Solution {
    
    static boolean[] visit;
    static int answer;
    static List<List<Integer>> list;
    
    public int solution(int n, int[][] wires) {
        answer = 987654321;
        
        for(int i = 0; i < wires.length; i++) {
            bfs(i, n, wires);
        }
        return answer;
    }
    
    private static void bfs(int idx, int n, int[][] wires) {
        list = new ArrayList<>();
        for(int i = 0; i < n; i++) {
            list.add(new ArrayList<>());
        }
        
        for(int i = 0; i < wires.length; i++) {
            if(i == idx) continue;
            int a = wires[i][0];
            int b = wires[i][1];
            
            list.get(a-1).add(b-1);
            list.get(b-1).add(a-1);
        }
        
        Queue<Integer> q = new ArrayDeque<>();
        q.offer(0);
        
        visit = new boolean[n];
        visit[0] = true;
        
        while(!q.isEmpty()) {
            int cur = q.poll();
            
            for(int o: list.get(cur)) {
                if(!visit[o]) {
                    visit[o] = true;
                    q.offer(o);
                }
            }
        }
                System.out.println(Arrays.toString(visit));

        int one = 0; 
        int two = 0;
        
        for(int i = 0; i < n; i++) {
            if(visit[i]) one++;
            else two++;
        }
        
                System.out.println(one + " " + two);

        answer = Math.min(answer, Math.abs(one-two));
    }
}