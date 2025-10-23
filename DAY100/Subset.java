class Solution {
    List<List<Integer>>res = new ArrayList<>();
    public void fun(int [] nums ,int index , List<Integer> list){
        res.add(new ArrayList<>(list));
        for(int i=index;i<nums.length;i++){
            list.add(nums[i]);
            fun(nums,i+1,list);
            list.remove(list.size()-1);
        }
    }
    public List<List<Integer>> subsets(int[] nums) {
        fun(nums,0,new ArrayList<>());
        return res;
    }
}
