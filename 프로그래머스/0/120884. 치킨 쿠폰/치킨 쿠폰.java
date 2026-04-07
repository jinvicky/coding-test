class Solution {
    public int solution(int chicken) {
        if(chicken < 10) return 0;
        
        int coupon = chicken; 
        int service = 0;
    
        while (coupon >= 10) {
            service += coupon / 10;
            coupon = (coupon / 10) + (coupon % 10);     
        }
        

        System.out.println(coupon);
        
        return service;
    }
}