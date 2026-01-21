import java.util.*;

class Solution {
    public String solution(int[] numbers) {

        // 1️⃣ int → String 변환
        String[] arr = Arrays.stream(numbers)
                             .mapToObj(String::valueOf)
                             .toArray(String[]::new);

        // 2️⃣ 커스텀 정렬
        Arrays.sort(arr, (a, b) -> (b + a).compareTo(a + b));

        // 3️⃣ 0만 있는 경우 처리
        if (arr[0].equals("0")) return "0";

        // 4️⃣ 이어 붙이기
        return String.join("", arr);
    }
}
