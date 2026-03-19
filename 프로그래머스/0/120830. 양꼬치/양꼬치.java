class Solution {
    public int solution(int n, int k) {
        int price = 0;
        int discount = (n / 10) * 2000;
        
        price = (12000 * n) + (2000 * k) - discount;
        
        return price;
    }
}