class Solution {
    public int solution(int n) {
       // n명이 주문한 피자고, 1판당 6조각으로 잘라준다. 
        
        if(n==6) return 1;
        
        int total = getLCM(n, 6);
        
        return total / 6;
        
    }
    
    // 1. 최대공약수(GCD) 구하기 (유클리드 호제법)
    public static int getGCD(int a, int b) {
        while (b != 0) {
            int r = a % b;
            a = b;
            b = r;
        }
        return a;
    }

    // 2. 최소공배수(LCM) 구하기
    public static int getLCM(int a, int b) {
        // (a * b) 과정에서 오버플로우가 발생할 수 있으므로 
        // a / getGCD(a, b) * b 순서로 계산하는 것이 안전합니다.
        return (a * b) / getGCD(a, b);
    }
}