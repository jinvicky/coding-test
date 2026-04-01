class Solution {
    public int solution(int[] array, int n) {
        int minDiff = Integer.MAX_VALUE;
        int closest = Integer.MAX_VALUE;
        
        for(int i = 0; i < array.length; i++) {
            int diff = Math.abs(n - array[i]);
            
            if(diff < minDiff || (diff == minDiff && array[i] < closest)) { 
                closest = array[i];
                minDiff = diff;
            }
        }
        
        return closest;
    }
}