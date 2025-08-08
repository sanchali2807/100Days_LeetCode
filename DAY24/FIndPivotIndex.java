class Solution {
    public int SumLeft(int []nums , int end){
        int sum = 0;
        for(int i=0;i<end;i++){
            sum = sum + nums[i];
        }
        return sum;
    }
    public int SumRight(int []nums , int st){
        int sum = 0;
        for(int i=st+1 ; i < nums.length ;i++){
            sum = sum + nums[i];
        }
        return sum;
    }
    public int pivotIndex(int[] nums) {
        int n = nums.length;
        int leftsum = 0;
        int rightsum = 0;
        for(int i = 0 ; i<n ;i++ ){
            if(i==0){
                leftsum = 0 ;
            }
            if(i==n-1){
                rightsum = 0;
            }
            leftsum = SumLeft(nums,i);
            rightsum = SumRight(nums,i);
            if(leftsum == rightsum){
                return i;
            }
        }
    return -1;
    }
}
