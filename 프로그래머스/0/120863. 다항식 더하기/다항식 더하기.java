class Solution {
    public String solution(String polynomial) {
        String[] split = polynomial.split(" ");
        
        int numSum = 0;
        int xSum = 0;

        for (String s : split) {
            if (s.contains("x")) { // x가 포함된 다항
                if(s.equals("x")) xSum++;
                else  {
                    int v = Integer.parseInt(s.substring(0, s.indexOf("x")));
                    xSum += v;
                }
            } else if (s.equals("+")) { // 연산자
                
            } else { // x가 없는 그저 숫자. 
                numSum += Integer.parseInt(s);
            }
        }
        
        if (xSum == 0) {
    return String.valueOf(numSum);
} else if (numSum == 0) {
    if (xSum == 1) return "x";
    return xSum + "x";
} else {
    String xPart = (xSum == 1) ? "x" : xSum + "x";
    return xPart + " + " + numSum;
}
    }
}