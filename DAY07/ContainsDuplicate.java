class Solution {
    public boolean containsDuplicate(int[] nums) {
        int n = nums.length;
        HashSet<Integer> hs = new HashSet<>();
        for(int i=0;i<n;i++){
            if(hs.contains(nums[i])){
                return true;
            }
            hs.add(nums[i]);
        }
        // int count = 1;
        // for(int i =0 ;i<n;i++){
           
        //     for(int j=n-1;j>=0 ;j--){
        //         if(nums[i] == nums[j] && i!=j){
        //             return true;
        //         }
        //     }
        //     // if(count>1){
        //     //     return true;
        //     // }
        // }
        return false;

    }
    
}
