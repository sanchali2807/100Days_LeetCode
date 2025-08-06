class Solution {
    public int[] searchRange(int[] nums, int target) {
         int[] res = {-1, -1};
        int n = nums.length;
        for(int i=0;i<n;i++){
            if(nums[i] == target ){
               if(res[0] == -1){
                res[0] = i;//here we get the first occurence
               }
               res[1] = i;//update till we get the last outcome
            }

        }

        return res;
    }
}
