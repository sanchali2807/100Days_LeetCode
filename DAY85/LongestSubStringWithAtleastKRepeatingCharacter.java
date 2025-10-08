class Solution {
    public int longestSubstring(String s, int k) {
        return helper(s,k);
    }
    public int helper (String s , int k){
        int []freq = new int[26];
        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);
            freq[c - 'a']++;
        }
        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);
            if(freq[c - 'a'] < k){
                int left = helper(s.substring(0,i),k);
                int right = helper(s.substring(i+1),k);
                return Math.max(left,right);
            }
        }
        return s.length();
    }
}
