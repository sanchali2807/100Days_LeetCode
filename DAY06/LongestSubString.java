class Solution {
    public int lengthOfLongestSubstring(String s) {
        int left = 0;
        int maxlen = 0;
        HashSet<Character> set = new HashSet<>();
        for(int right = 0 ; right<s.length() ;right++){
            while(set.contains(s.charAt(right))){
                set.remove(s.charAt(left));
                left++;
            }
            set.add(s.charAt(right));
            maxlen = Math.max(maxlen,right-left+1);
        }
        return maxlen;
    }
}
