class Solution {
    public int[] productExceptSelf(int[] nums) {
       int n = nums.length;
       int left =1;
       int right =1;
       int [] res = new int[n];
       for(int i=0;i<n;i++){
        res[i]= left;
        left=left*nums[i];
       }
       for(int i = n-1;i>=0;i--){
        res[i] = res[i]*right;
        right = right * nums[i];
       }
return res;
}

}
