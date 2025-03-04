import java.util.*;
class Solution {
    public int solution(int n, int[] lost, int[] reserve) {
          // 잃어버린 학생과 여벌 체육복을 가진 학생들을 정렬
        Arrays.sort(lost);
        Arrays.sort(reserve);

        // 여벌 체육복을 가지고 있지만 자신도 잃어버린 학생 처리
        Set<Integer> lostSet = new HashSet<>();
        Set<Integer> reserveSet = new HashSet<>();

        // 여벌 체육복을 가진 학생 중 자신도 잃어버린 학생 처리
        for (int i = 0; i < lost.length; i++) {
            lostSet.add(lost[i]);
        }
        
        for (int i = 0; i < reserve.length; i++) {
            if (lostSet.contains(reserve[i])) {
                // 자신도 잃어버린 학생이라면 여벌 체육복을 빌려줄 수 없음
                lostSet.remove(reserve[i]);
            } else {
                reserveSet.add(reserve[i]);
            }
        }

        // 여벌 체육복을 빌려줄 수 있는 학생 처리
        for (int student : reserveSet) {
            if (lostSet.contains(student - 1)) {
                lostSet.remove(student - 1); // 앞 번호 학생에게 체육복을 빌려줌
            } else if (lostSet.contains(student + 1)) {
                lostSet.remove(student + 1); // 뒤 번호 학생에게 체육복을 빌려줌
            }
        }

        // 체육수업을 들을 수 있는 학생 수는 전체 학생 수에서 잃어버린 학생을 제외한 수
        return n - lostSet.size();
    }
}