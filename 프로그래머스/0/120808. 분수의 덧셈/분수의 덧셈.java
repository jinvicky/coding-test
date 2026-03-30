class Solution {
    public int[] solution(int numer1, int denom1, int numer2, int denom2) {
        int[] answer = {};
        
        // 분모들끼리 곱한다. 
        int parent = denom1 * denom2;
        
        int leftChild = numer1  * denom2;
        int rightChild = numer2 * denom1;
        
        int childTotal = leftChild + rightChild;
        
        // parent와 childTotal의 최대공약수를 구한다. 
        int gcd = gcd(parent, childTotal);
        
        return new int[]{childTotal / gcd, parent/ gcd};
    }
    
    public int gcd(int a , int b) {
        while(b != 0) {
            int temp = a % b;
            a = b;
            b = temp;
        }
        return a;
    }
}