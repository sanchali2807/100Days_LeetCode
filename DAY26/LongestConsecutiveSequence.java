class Solution {
    public int longestConsecutive(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        int count=1;
        int max =1;
        if(nums.length==0)return 0;
        for(int i=1;i<n;i++){
            if(nums[i]==nums[i-1]){
                continue;
            }
            else if(nums[i] == nums[i-1] + 1){
                count++;
            }else{
                count=1;
            }


            if(count>max){
                max=count;
            }
        }
        return max;
    }
}
