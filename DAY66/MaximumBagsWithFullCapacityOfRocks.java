class Solution {
    public int maximumBags(int[] capacity, int[] rocks, int additionalRocks) {
        int [] diff = new int[capacity.length];
        int idx = 0;
        for(int i=0;i<capacity.length;i++){
            diff[idx++] = capacity[i] - rocks[i]; 
        }
        Arrays.sort(diff);
        int count=0;
        for(int i=0;i<diff.length;i++){
            if(diff[i] == 0){
                count++;
            }else if(diff[i] <= additionalRocks){
                additionalRocks -= diff[i];
                count++;
            }else{
                break;
            }
            
        }
        return count;
    }
}
