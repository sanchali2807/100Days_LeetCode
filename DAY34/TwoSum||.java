class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int[] res = {-1,-1};
        int l = 0;
        int r = numbers.length-1;
        while(l<r){
            int sum = numbers[l] + numbers[r];
            if(sum == target){
                res[0] = l+1;
                res[1] = r+1;
                return res;
            }else if(sum < target){
                l++;
            }else{
                r--;
            }
        }
        return res;
    }
}
