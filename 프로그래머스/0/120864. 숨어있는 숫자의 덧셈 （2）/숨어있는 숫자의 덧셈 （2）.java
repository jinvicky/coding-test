class Solution {
    public int solution(String my_string) {
        int answer = 0;
        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < my_string.length(); i++){
            char c = my_string.charAt(i);

            if(Character.isDigit(c)) {
                sb.append(c);
            } else {
                if(sb.length() > 0) {
                    answer += Integer.parseInt(sb.toString());
                    sb.setLength(0); // 초기화
                }
            }
        }

        // 마지막 숫자 처리 (🔥 중요)
        if(sb.length() > 0) {
            answer += Integer.parseInt(sb.toString());
        }

        return answer;
    }
}