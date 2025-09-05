class Solution {
    public int characterReplacement(String s, int k) {
        int n = s.length();
        int [] freq = new int[26];
        int j = 0;
        int best = 0;
        int maxFreq = 0;
        for(int i=0;i<n;i++){
            freq[s.charAt(i) - 'A']++;
             maxFreq = Math.max(freq[s.charAt(i)-'A'],maxFreq);

            while(i-j+1 - maxFreq > k){
                freq[s.charAt(j) - 'A']--;
                j++;
            }

            best = Math.max(best,i-j+1);
        }
        return best;
    }
}
