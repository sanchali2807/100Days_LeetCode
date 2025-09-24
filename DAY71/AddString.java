import java.math.BigInteger;

class Solution {
    public String addStrings(String num1, String num2) {
        BigInteger n = new BigInteger(num1);
        BigInteger m = new BigInteger(num2);
        BigInteger result = n.add(m); 
        return result.toString();
    }
}
