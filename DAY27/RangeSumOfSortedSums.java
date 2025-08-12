class Solution {
    public int rangeSum(int[] nums, int n, int left, int right) {
        List<Integer> list = new ArrayList<>();
        int sum = 0;
         int mod = 1_000_000_007;
       for(int i=0;i<n;i++){
        sum = 0;
        for(int j = i ; j<n;j++){
            sum = sum + nums[j];
            list.add(sum);
        }
       }
        int result = 0;
        Collections.sort(list);
        for(int i=left-1;i<right;i++){
              result = (result + list.get(i)) % mod;
        }
return result;
    }
}
