class Solution {
    public boolean isPowerOfTwo(int n) {
        if(n==1)return true;
            int i = 0;
            while(Math.pow(2, i) <= n){
                if(Math.pow(2,i) == n)return true;
                i = i+1;
            }
        
        return false;
    }
}
