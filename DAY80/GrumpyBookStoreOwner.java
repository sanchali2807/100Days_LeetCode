class Solution {
    public int maxSatisfied(int[] customer, int[] grumpy, int minutes) {
        int sum = 0;
        for(int i=0;i<customer.length;i++){
            if(grumpy[i] == 0){
                sum += customer[i];
            }
        }
        int max = 0;
        int sum1=0;
        int l = 0;
        int r = 0;
        int window = 0;
        while(r<customer.length){
            if(grumpy[r] == 1){
                sum1 += customer[r];
            }
            window++;
            if(window > minutes){
                if(grumpy[l] == 1){
                    sum1 -= customer[l];
                }
                l++;
                window--;
            }
            max = Math.max(sum1,max);
            r++;
        }
        return max+sum;
    }
}
