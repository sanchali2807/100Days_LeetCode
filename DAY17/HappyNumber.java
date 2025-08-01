class Solution {
    public int getNum(int n){
        int res = 0;
        while(n!=0){
            int digit = n%10;
            res += digit*digit;
            n = n/10;
        }
        return res;

    }
    public boolean isHappy(int n) {
        Set<Integer> st = new HashSet<>();
        while(!st.contains(n)){
            st.add(n);
            n = getNum(n);
            if(n==1){
                return true;
            }
        }
        return false;
    }
}
