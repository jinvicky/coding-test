class Solution {
    public int[] solution(int money) {
        // 전형적인 그리디 문제다. 
        
        int coffee = 5500;
        int m = money;
        int cup = 0;
        
        while(m >= coffee) {
            cup++;
            m -= coffee;
        }
        
        System.out.println("cup and m" + cup  + " " + m);
        return new int[]{cup, m};
    }
}