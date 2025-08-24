class Solution {
    public int maxSum(int[] nums) {
        Set<Integer> st = new HashSet<>();
        int sum = 0;
        int max = Integer.MIN_VALUE;;
        int ans = 0;
        for(int i = 0; i<nums.length ;i++){
            if(!st.contains(nums[i]) && nums[i] >= 0){
                st.add(nums[i]);
                sum += nums[i];
            }else{
                ans++;
                max = Math.max(max,nums[i]);
            }
        }
        if(ans == nums.length){
            return max;
        }else{
            return sum;
        }
    }
}
