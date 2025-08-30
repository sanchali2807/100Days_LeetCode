class Solution {
    public int[] leftRightDifference(int[] nums) {
        int n = nums.length;
        int[] leftSum = new int[n];
        leftSum[0] = 0;
        int[] rightSum = new int[n];
        rightSum[n - 1] = 0;
        int[] res = new int[n];

        int suml = 0;
        int sumr = 0;
        int li = 1;
        int ri = n - 2;


        for (int i = 0; i < n - 1; i++) {
            suml += nums[i];
            leftSum[li++] = suml;
        }


        for (int i = n - 1; i >= 1; i--) {
            sumr += nums[i];
            rightSum[ri--] = sumr;
        }


        for (int i = 0; i < n; i++) {
            res[i] = Math.abs(leftSum[i] - rightSum[i]);
        }

        return res;
    }
}
