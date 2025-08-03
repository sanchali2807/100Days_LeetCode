class Solution {
    public int maxOperations(int[] nums, int k) {
       int n = nums.length;
       int count = 0;
       Map<Integer,Integer> mp = new HashMap<>();
       for(int i = 0 ;i < n ;i++){
        int target = k - nums[i];
        if(mp.containsKey(target) && mp.get(target)>0){
            int freq = mp.get(target);
            mp.put(target,freq-1);
            count++;
        }else if(mp.containsKey(nums[i])){
            int freq = mp.get(nums[i]);
            mp.put(nums[i],freq+1);
        }
        else{
            mp.put(nums[i],1);
        }
       }
       return count;
    }
}
