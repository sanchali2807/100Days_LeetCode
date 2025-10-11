class Solution {
    List<List<Integer>> list = new ArrayList<>(); 
    public void CombineSum(List<Integer> result,int[]candidates,int target,int sum,int idx){
        if(sum == target){
            list.add(new ArrayList<>(result));
            return;
        }
        if(sum>target || idx == candidates.length)return;
        result.add(candidates[idx]);
        CombineSum(result,candidates,target,sum+candidates[idx],idx);
        result.remove(result.size()-1);
        CombineSum(result,candidates,target,sum,idx+1);
    }
    public List<List<Integer>> combinationSum(int[] candidates, int target) {

        CombineSum(new ArrayList<>(), candidates , target,0,0);
        return list;
    }
}
