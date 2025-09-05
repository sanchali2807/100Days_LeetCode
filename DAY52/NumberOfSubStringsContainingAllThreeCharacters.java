class Solution {
    public int numberOfSubstrings(String s) {
        int n = s.length();
        int [] freq = new int[3];

        int count = 0;
        int l = 0;
        for(int r=0;r<n;r++){
                freq[s.charAt(r) - 'a']++;
                while(freq[0]>0 && freq[1]>0 && freq[2]>0){
                    freq[s.charAt(l)-'a']--;
                    count += n-r;
                    l++;
                }

            }
        
    return count;
    }
}
