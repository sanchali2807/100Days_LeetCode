class Solution {
    public int minIncrementForUnique(int[] arr) {
        Arrays.sort(arr);
        int count = 0;
        for(int i=1;i<arr.length;i++){
            while(arr[i]<=arr[i-1]){
                arr[i] = arr[i]+1;
                count++;
            }
        }
        return count;
    }
}

