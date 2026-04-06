class Solution {
    public String solution(String my_string, int num1, int num2) {
        char c1 = my_string.charAt(num1);
        char c2 = my_string.charAt(num2);
        
        StringBuilder sb = new StringBuilder();
        
        for(int i = 0; i < my_string.length(); i++) {
            if(i== num1) {
                sb.append(c2);
            } else if (i == num2) {
                sb.append(c1);
            } else {
                sb.append(my_string.charAt(i));
            }
        }
        return sb.toString();
    }
}