class Solution {
    public int findKthPositive(int[] arr, int k) {
        Set<Integer> hs = new HashSet<>();
        for(int i : arr){
            hs.add(i);
        }
        int count = 0;
        int x = 1;
        int res = 0;
        while(count<k){
            if(!hs.contains(x)){
                count++;
            }
            res = x;
            x++;
        }
        return res;
    }
}
