class Solution {
    public long solution(int price, int money, int count) {
        long priceSum = 0;
        
        for(int i = 1; i <= count; i++) {
            priceSum += price * i;
        }

        return money - priceSum > 0 ? 0 : Math.abs(money - priceSum);
    }
}