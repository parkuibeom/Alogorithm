import java.math.BigInteger;
class Solution {
    public BigInteger solution(int balls, int share) {
        BigInteger answer = factorial(balls).divide(factorial(share).multiply(factorial(balls - share)));     
        return answer;
    }
    
    private BigInteger factorial(int num) {
        if (num == 0 || num == 1) {
            return BigInteger.ONE;
        }
        BigInteger result = BigInteger.ONE;
        for (int i = 2; i <= num; i++) {
            result = result.multiply(BigInteger.valueOf(i));
        }
        return result;
    }
}