class Solution {
    public int takeCharacters(String s, int k) {
      int [] count = new int[3];
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            count[ch - 'a']++;
        }

        if(count[0]<k || count[1]<k || count[2]<k){
            return -1;
        }

        int l = 0;
        int max = 0;
        for(int r=0;r<s.length();r++){
            
            count[s.charAt(r) - 'a']--;

            while(count[0]<k || count[1]<k || count[2]<k){
                count[s.charAt(l) - 'a']++;
                l++;
            }

            max = Math.max(r-l+1,max);
        }


return s.length() - max;

    }
}
