class Solution {
    public boolean canShip(int [] arr , int days,int mid){
        int csum = 0;
        int count = 1;
        for(int i=0;i<arr.length;i++){
            if(csum + arr[i] > mid){
                csum = arr[i];
                count++;
            }else{
                csum += arr[i];
            }
            }
            return count<=days;
    }
    public int shipWithinDays(int[] weights, int days) {
        int n = weights.length;
        int sum = 0;
        int max = 0;
        for(int i=0;i<weights.length;i++){
            sum = sum + weights[i];
            max = Math.max(weights[i],max);
        }
        int day = 0;
        int low = max;
        int high = sum;
        while(low<high){
            int mid = low + (high-low)/2;
            if(canShip(weights,days,mid)){
                high = mid;
            }else{
                low = mid+1;
            }
            }
        
        return low;
    }
}
