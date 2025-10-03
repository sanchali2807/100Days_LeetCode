class Solution {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        List<Integer> list = new ArrayList<>();
        int l = 0;
        int r = arr.length-1;
        while(r-l+1 > k){
            if(Math.abs(arr[l] - x) > Math.abs(arr[r]-x)){
                l++;
            }else{
                r--;
            }
        }
        for(int i=l;i<=r;i++){
            list.add(arr[i]);
        }
        return list;
    }
}
