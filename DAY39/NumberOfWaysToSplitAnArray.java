
class Solution {
    public int waysToSplitArray(int[] nums) {
        int n = nums.length;
        long total = 0;
        long prefix = 0;
        for(int i=0;i<n;i++){
            total += nums[i];
        }
        int count = 0;
        for(int i=0;i<n-1;i++){
            prefix += nums[i];
            if(prefix >= total-prefix){
                count++;
            }
        }
        return count;
    }
}
