class Solution {
    public int findKthLargest(int[] nums, int k) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            min = Math.min(nums[i],min);
            max = Math.max(nums[i],max);
        }
        int [] freq = new int[max-min+1];
        for(int num : nums){
            freq[num-min]++;
        }
        int count = 0;
        for(int i = freq.length - 1 ; i>=0;i--){
            count += freq[i];
            if(count >= k){
                return i+min;
            }
        }
        return -1;
    }

}
