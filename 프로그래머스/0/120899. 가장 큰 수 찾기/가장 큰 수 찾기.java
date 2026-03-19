class Solution {
    public int[] solution(int[] array) {
        int maxV = 0;
        int idx = 0;
        for(int i = 0; i < array.length; i++) {
            if(maxV < array[i]) {
                maxV = array[i];
                idx = i;
            }
        }
        return new int[] {maxV, idx};
    }
}