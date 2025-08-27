import java.math.BigInteger;

class Solution {
    public String addBinary(String a, String b) {
        BigInteger n = new BigInteger(a, 2);  // parse binary string
        BigInteger m = new BigInteger(b, 2);

        while (!m.equals(BigInteger.ZERO)) {
            BigInteger carry = n.and(m).shiftLeft(1); // calculate carry
            n = n.xor(m);                             // sum without carry
            m = carry;                                // update m with carry
        }

        return n.toString(2); // convert result back to binary string
    }
}
