class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int n = nums.length;
        Deque <Integer> dq = new ArrayDeque<>();
        int [] result = new int [n-k+1];
        int idx = 0;
        for(int i=0;i<n;i++){
            if(!dq.isEmpty() && dq.peekFirst() < i-k+1){
                dq.pollFirst();
            }
            while(!dq.isEmpty() && nums[dq.peekLast()] < nums[i]){
                dq.pollLast();
            }
            dq.addLast(i);
            if(i >= k-1){
                result[idx++] = nums[dq.peekFirst()];
            }
        }
        return result;
    }
}
