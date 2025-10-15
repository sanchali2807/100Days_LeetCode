class Solution {
    public int minDays(int[] bloomDay, int m, int k) {
        int n = bloomDay.length;
        if ((long)m * k > n) return -1;
        int low = Integer.MAX_VALUE;
        int high = Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            low = Math.min(low,bloomDay[i]);
            high = Math.max(high,bloomDay[i]);
        }
        int answer = 0;
        while(low<=high){
            int mid = low + (high - low)/2;
            if(canMake(bloomDay,mid,m,k)){
                answer = mid;
                high = mid - 1;
            }else{
                low = mid + 1;
            }
        }
        return answer;

    }
    public boolean canMake(int []bloomDay , int day,int m,int k){
        int flower = 0;
        int bouquets = 0;
        for(int i=0;i<bloomDay.length;i++){
            if(bloomDay[i] <= day){
                flower++;
                if(flower == k){
                    bouquets++;
                    flower = 0;
                }
            }else{
                flower = 0;
            }
        }
        return bouquets >= m;
    }
}
