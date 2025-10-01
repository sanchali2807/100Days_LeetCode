class Solution {
    public int returnSum(int num){
        int sum = 0;
        while(num != 0){
            int digit = num % 10;
            sum += digit;
            num = num / 10;
        }
        return sum;
    }
    public int addDigits(int num) {
        int res = returnSum(num);
        while(res > 9){       
            res = returnSum(res);
        }
        return res;
    }
}
