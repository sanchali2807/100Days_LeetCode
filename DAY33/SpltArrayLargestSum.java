class Solution {
    public boolean isSplit(int [] nums,int mid,int k){
        int csum = 0;
        int count = 1;
        for(int i=0;i<nums.length;i++){
            if(csum+nums[i]>mid){
                count++;
                csum = nums[i];
            }else{
            csum += nums[i];
            }
        }
        return count<=k;
    }
    public int splitArray(int[] nums, int k) {
        int n = nums.length;
        int max = Integer.MIN_VALUE;
        int sum = 0;
        for(int i=0;i<n;i++){
            max = Math.max(max,nums[i]);
            sum = sum + nums[i];
        }
        int st = max;
        int end = sum;
        while(st<end){
            int mid = st + (end-st)/2;
            if(isSplit(nums,mid,k)){
                end = mid;
            }else{
                st = mid + 1;
            }
        }
        return st;
    }
}
