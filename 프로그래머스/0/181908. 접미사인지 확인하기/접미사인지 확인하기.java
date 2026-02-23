class Solution {
    public int solution(String my_string, String is_suffix) {
        
        if (my_string.length() < is_suffix.length()) {
            return 0;
        }

        String sub = my_string.substring(
            my_string.length() - is_suffix.length()
        );

        return sub.equals(is_suffix) ? 1 : 0;
    }
}