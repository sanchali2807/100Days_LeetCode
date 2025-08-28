class Solution {
    public int largestAltitude(int[] gain) {
        int altitude[] = new int[gain.length+1];
        altitude[0] = 0;
        // altitude[1] = gain[0];
        int idx = 1;
        int sum = 0;
        int max = Integer.MIN_VALUE;
        for(int i=0;i<gain.length;i++){
            sum = sum + gain[i];
            altitude[idx] = sum;
            max = Math.max(sum,max);
            idx++;
        }
            if(max < 0){
                return 0;
            }
        return max;
    }
}
