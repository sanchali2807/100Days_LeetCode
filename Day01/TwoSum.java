
class Solution {
    public int[] twoSum(int[] nums, int target) {
       int n = nums.length;
       for(int i =0;i<n ;i++){
        for(int j=n-1;j>=0;j--){
            if(nums[i]+nums[j]==target && i!=j){
                return new int[]{i,j};
            }
        }
       }
       return new int[]{-1,-1};
    }
}
