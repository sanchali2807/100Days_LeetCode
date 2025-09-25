class Solution {
    public boolean lemonadeChange(int[] bill) {
        int ten = 0;
        int five = 0;
        for(int i=0;i<bill.length;i++){
            if(bill[i] == 5){
                five++;
            }
            if(bill[i] == 10){
                if(five==0)return false;
                five--;
                ten++;
            }
            if(bill[i] == 20){
                if(five > 0 && ten > 0){
                    five--;
                    ten--;
                }else if(five >=3){
                    five = five-3;
                }else{
                    return false;
                }
            }
        }

        return true;
    }
}
