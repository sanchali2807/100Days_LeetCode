class Solution {
    public int[] plusOne(int[] arr) {
        int n = arr.length;
        for(int i = n-1 ;i>=0;i--){
            if(arr[i]+1 != 10){
             arr[i] = arr[i]+1;
             return arr;
            }
            arr[i]=0;
        }
        int [] newdigit = new int[n+1];
        newdigit[0] = 1;
        return newdigit;
    }
}
