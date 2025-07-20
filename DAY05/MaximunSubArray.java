class Solution {
    public int maxSubArray(int[] arr) {
        int n = arr.length;
        int sum = 0;
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {
            sum = sum + arr[i];
            if (sum > max) {
                max = sum;
            }
            if (sum < 0) {
                sum = 0;
            }
        }
            // for(int j=i;j<n;j++){
            //     int sum=0;
            //     for(int k = i ; k<=j;k++){
            //         sum=sum+arr[k];
            //     }
            //  maxi = Math.max(maxi, sum);
            // }
        
        return max;
    }
}
