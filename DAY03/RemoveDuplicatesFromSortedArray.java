class Solution {
    public int removeDuplicates(int[] arr) {
        int n = arr.length;
        
            int j = 1;
            int i = 0;
        while(j<n){
            if(arr[j]==arr[i]){
                j++;
            }else{
                i++;
                arr[i]=arr[j];
                j++;
            }
        }

        return i+1;
    }
}
