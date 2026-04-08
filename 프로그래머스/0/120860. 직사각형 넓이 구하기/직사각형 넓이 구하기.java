class Solution {
    public int solution(int[][] dots) {
        int[] x1 = dots[0];
        int[] x2 = dots[1];
        int[] x3 = dots[2];
        int[] x4 = dots[3];
        
        int minX = Math.min(x1[0], Math.min(x2[0], Math.min(x3[0], x4[0])));
        int maxX = Math.max(x1[0], Math.max(x2[0], Math.max(x3[0], x4[0])));
        
        int minY = Math.min(x1[1], Math.min(x2[1], Math.min(x3[1], x4[1])));
        int maxY = Math.max(x1[1], Math.max(x2[1], Math.max(x3[1], x4[1])));

        
        return (maxX - minX) * (maxY - minY);
    }
}