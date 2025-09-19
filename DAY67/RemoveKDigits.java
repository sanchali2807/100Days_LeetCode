class Solution {
    public String removeKdigits(String num, int k) {
        Stack<Character> st = new Stack<>();
        st.push(num.charAt(0));
        for(int i= 1;i<num.length();i++){
            char c = num.charAt(i);
            while (!st.isEmpty() && k > 0 && st.peek() > c){
                st.pop();
                k--;
            }
            st.push(c);

        }
        while(!st.isEmpty() && k>0){
            st.pop();
            k--;
        }

        
        StringBuilder str = new StringBuilder();
        while(st.size()>0){
            str.append(st.pop());

        }
        str.reverse();
        while (str.length() > 0 && str.charAt(0) == '0') {
            str.deleteCharAt(0);
        }
        return str.length() == 0 ? "0" : str.toString();
}}
