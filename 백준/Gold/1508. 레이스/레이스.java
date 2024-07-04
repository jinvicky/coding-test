import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	static int n, m, k;
	static int[] arr;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());
		k = Integer.parseInt(st.nextToken());

		arr = new int[k];
		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < k; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}

		// 이분탐색
		String result = "";
		int start = 0;
		int end = n;
		while (start <= end) {
			int mid = (start + end) / 2;

			String res = "1";
			int count = 1;
			int prev = 0;
			for (int i = 1; i < k; i++) {
				if (arr[i] - arr[prev] >= mid) { // 구간 간격이 mid보다 크거나 같으면 1
					res += "1";
					count++;
					prev = i;
					if (count == m)
						break;
				} else {// 구간 간격이 mid보다 작으면 0
					res += "0";
				}
			}

			// 남는 자리는 0으로 채우기
			while (res.length() < k)
				res += "0";

			if (count == m) {
				start = mid + 1;
				result = res;
			} else {
				end = mid - 1;
			}

		}

		System.out.println(result);

	}

}