class Solution {
    public int maximum69Number (int num) {
         int len = String.valueOf(num).length();
        int temp = num;
        int [] arr = new int [len];
        int idx = len-1;
        while(temp!=0){
            int digit = temp%10;
            arr[idx--] = digit;
            temp = temp/10;
        }
        int res=0;
        for (int j = 0; j < arr.length; j++) {
    if (arr[j] == 6) {
        arr[j] = 9;
        break;
    }
}
        for(int i:arr){
            res = res * 10 + i;
        }
    return res;
    }
}
