class Solution {
    public String[] findWords(String[] words) {
        ArrayList<String> ans= new ArrayList<>();
        String row1="qwertyuiop";
        String row2="asdfghjkl";
        String row3="zxcvbnm";
        for(String w:words){
            if(isinrow(w,row1)||isinrow(w,row2)||isinrow(w,row3)){
                ans.add(w);
            }
        }
        return ans.toArray(new String[0]);
    }
    public boolean isinrow(String w,String row){
        for(char c:w.toCharArray()){
            if(row.indexOf(Character.toLowerCase(c))==-1){
                return false;
            }

        }
        return true;
    }

}
