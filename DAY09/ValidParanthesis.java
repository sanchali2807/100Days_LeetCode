class Solution {
    public boolean isValid(String s) {
        Stack<Character> st = new Stack<Character>();
        int n = s.length();
        // for(int i=0 ;i<n ;i++){
        //     char ch = s.charAt(i);
        //     if(ch == '(' ){
        //         st.push(ch);
        //     }else if(ch == ')'){
        //         st.pop();
        //     } if(ch == '[' ){
        //         st.push(ch);
        //     }else if(ch == ']'){
        //         st.pop();
        //         }
        //         if(ch == '{' ){
        //         st.push(ch);
        //     }else if(ch == '}'){
        //         st.pop();
        //         }
            
        // }
        // if(st.isEmpty())return true;
        // return false;
            for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == '(' || ch == '[' || ch == '{') {
                st.push(ch);
            } else {
                if (st.isEmpty()) return false;

                char top = st.pop();

                if ((ch == ')' && top != '(') ||
                    (ch == ']' && top != '[') ||
                    (ch == '}' && top != '{')) {
                    return false;
                }
            }
        }

        return st.isEmpty();
    }
}
