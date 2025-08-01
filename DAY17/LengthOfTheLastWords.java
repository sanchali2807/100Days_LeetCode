class Solution {
    public int lengthOfLastWord(String s) {
        String[] words = s.split("\\s+");
        int n = words.length;
        StringBuilder str = new StringBuilder();
        for(int i=0;i<words.length;i++){
            if(i==n-1){
                str.append(words[i]);
            }
        }
        return str.length();
    }
}
