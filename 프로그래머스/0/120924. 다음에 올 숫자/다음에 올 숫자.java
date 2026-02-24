class Solution {
    public int solution(int[] common) {
        
        int d1 = common[1] - common[0];
        int d2 = common[2] - common[1];

        // 등차수열
        if (d1 == d2) {
            return common[common.length - 1] + d1;
        } 
        // 등비수열
        else {
            int ratio = common[1] / common[0];
            return common[common.length - 1] * ratio;
        }
    }
}