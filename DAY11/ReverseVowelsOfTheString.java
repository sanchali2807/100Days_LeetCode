class Solution {
    public boolean isvowel(char ch){
        ch=Character.toLowerCase(ch);
        if(ch == 'a' || ch == 'e' || ch== 'i' || ch =='o' || ch == 'u'){
            return true;
        }
        return false;

    }
    public String reverseVowels(String s) {
        int n = s.length();
        int i = 0 ;
        int j = n-1;
        char [] ch = s.toCharArray();
        while(i<j){
            if(isvowel(ch[i]) && isvowel(ch[j])){
                char temp = ch[i];
                ch[i] = ch[j];
                ch[j] = temp;
                i++;
                j--;
            }else if(!isvowel(ch[i]) && !isvowel(ch[j])){
                i++;
                j--;
            }else if(!isvowel(ch[i]) && isvowel(ch[j])){
                i++;
            }else{
                j--;
            }
        }
        return new String(ch);
    }
}
