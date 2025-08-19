class Solution {
    public List<Integer> majorityElement(int[] nums) {
        Arrays.sort(nums);
        List<Integer> list = new ArrayList<>();
        int count=1;
        for(int i=1;i<nums.length;i++){
            if( nums[i] == nums[i-1]){
                count++;
            }
            else{
                if(count > nums.length/3 && !list.contains(nums[i-1])){
                    list.add(nums[i-1]);
                }
                count = 1;
            }
        }
            if (count > nums.length / 3 && !list.contains(nums[nums.length - 1])) {
            list.add(nums[nums.length - 1]);
        }
        return list;
    }
}
