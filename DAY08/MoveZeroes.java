class Solution {
    public void moveZeroes(int[] arr) {
        int n = arr.length;
        int i = 0;
        int j = 1;
        while(i<j && j<n){
            if(arr[i]==0){
                if(arr[i]!=arr[j]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                    i++;
                    j++;
                }else{
                    j++;
                }
            }else{
                i++;
                j++;
            }
        }
    }
}
