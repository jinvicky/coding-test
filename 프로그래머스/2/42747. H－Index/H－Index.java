// import java.util.*;

// class Solution {
//     public int solution(int[] citations) {
//         Arrays.sort(citations);
//         int n = citations.length;
//         int h = 0;
        
//         for(int i = n-1; i >= 0; i--) {
            
//             if(citations[i] >= (n - i)) {
//                 h = n-i;
//             }
//         }
        
//         return h;
//     }
// }
import java.util.Arrays;

class Solution {
    public int solution(int[] citations) {
        // 1️⃣ 내림차순 정렬
        Arrays.sort(citations);
        int n = citations.length;
        int hIndex = 0;

        // 2️⃣ 배열을 뒤에서 앞으로 순회 (내림차순 효과)
        for (int i = 0; i < n; i++) {
            int hCandidate = Math.min(citations[n - 1 - i], i + 1);
            hIndex = Math.max(hIndex, hCandidate);
        }

        return hIndex;
    }
}