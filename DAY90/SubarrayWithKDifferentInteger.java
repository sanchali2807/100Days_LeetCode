class Solution {
    public int subarraysWithKDistinct(int[] nums, int k) {
        return atMostK(nums,k) - atMostK(nums,k-1);
    }
    public int atMostK(int [] nums , int k){
        int l = 0;
        int r = 0;
        int result = 0;
        Map<Integer,Integer> mp = new HashMap<>();
        int n = nums.length;
        while(r<n){
            mp.put(nums[r] , mp.getOrDefault(nums[r],0)+1);
            while(mp.size() > k){
                mp.put(nums[l],mp.get(nums[l])-1);
                if(mp.get(nums[l]) == 0){
                    mp.remove(nums[l]);
                }
                l++;
            }
            result += r - l + 1;

            r++;
        }
        return result;
    }
}
