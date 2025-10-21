class Solution {
    public String removeOuterParentheses(String s) {
        int depth = 0;
        StringBuilder result = new StringBuilder();
        for(char c : s.toCharArray()){
            if(c == '('){
                if(depth > 0){
                    result.append(c);
                }
                depth++;
            }else{
                depth--;
                if(depth > 0){
                    result.append(c);
                }
            }
        }
        return result.toString();
    }
}
