class Solution {
    public double solution(int[] numbers) {
        int v = 0;
        
        for(int n : numbers) {
            v+= n;
        }
        
        return (double) v / numbers.length;
    }
}