class Solution {
    List<List<Integer>> res = new ArrayList<>();
    public void fun(int [] nums , List<Integer> list,boolean [] used){
        if(list.size() == nums.length){
            res.add(new ArrayList<>(list));
            return;
        }
        for(int i=0;i<nums.length;i++){
            if(used[i])continue;
            list.add(nums[i]);
            used[i] = true;
            fun(nums,list,used);
            used[i] = false;
            list.remove(list.size()-1);
        }
    }
    public List<List<Integer>> permute(int[] nums) {
        boolean [] used = new boolean[nums.length];
        fun(nums,new ArrayList<>(),used);
        return res;
    }
}
