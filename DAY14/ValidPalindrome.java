class Solution {
    public boolean isPalindrome(String s) {

     s = s.toLowerCase();
     int n = s.length();
    StringBuilder str = new StringBuilder(n);
    for(int i = 0 ;i<n ;i++){
        if(Character.isLetterOrDigit(s.charAt(i))){
            str.append(s.charAt(i));
        }
    }
    String str1 = str.toString();
    String isReverse = str.reverse().toString();

    return str1.equals(isReverse);

     
    }
}
