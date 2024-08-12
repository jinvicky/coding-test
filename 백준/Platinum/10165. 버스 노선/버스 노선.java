import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st =  null;
		int n = Integer.parseInt(br.readLine());
		int m = Integer.parseInt(br.readLine());
		
		int last =0;
		List<Route> list = new ArrayList<>();
		for(int i=0; i<m; i++) {
			st = new StringTokenizer(br.readLine());
			int s = Integer.parseInt(st.nextToken());
			int e = Integer.parseInt(st.nextToken());
			
			if(s>e) { // 시작점 통과하는 노선
				last = Math.max(last, e); // 가장 나중에 도착하는 정류장 번호
				e += n; // 도착 정류장+n
			}
			list.add(new Route(i+1, s,e));
		}
		
		Deque<Route> q= new ArrayDeque<>();
		Collections.sort(list); // 시작 정류장 오름차순 정렬 (시작 정류장 같으면 도착 정류장 내림차순)
		for(Route r : list){
			// 첫 번째 거르기
			// 이전 노선의 도착 정류장보다 해당 노선의 도착 정류장이 큰 경우에만 저장
			// (i.e < i+1.e)
			if(q.isEmpty() || q.getLast().e < r.e ) {
				q.add(r); 
			}
		}
		// 두 번째 거르기
		// 시작점을 지나는 노선의 도착 정류장보다 작은 노선들 제거 (i.e <= last)
		while (!q.isEmpty() && q.getFirst().e <= last) {
			Route r = q.removeFirst();
		}
		
		List<Integer> res = new ArrayList<>();
		while (!q.isEmpty()) {
			int idx = q.poll().idx;
			res.add(idx);
		}
		Collections.sort(res, (a,b) -> (a-b));
		for(int idx : res) {
			System.out.print(idx+" ");
		}
	}
}

class Route implements Comparable<Route>{
	int idx;
	int s;
	int e;
	
	public Route(int idx, int s, int e) {
		this.idx = idx;
		this.s = s;
		this.e = e;
	}

	@Override
	public int compareTo(Route o) {
		if(this.s == o.s) {
			return o.e - this.e; // 시작이 같을 경우, 도착 노선 큰 순서대로 내림차순
		}
		return this.s - o.s; // 시작 노선 오름차순 
	}
}