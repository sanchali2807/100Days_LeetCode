class Solution {
    public String removeDuplicateLetters(String s) {
        int n = s.length();
        int []last = new int[26];
        for(int i=0;i<n;i++){
            char c = s.charAt(i);
            last[c - 'a'] = i;
        }
        Stack<Character> st = new Stack<>();
        Set<Character> inSt = new HashSet<>();
        for(int i=0;i<n;i++){
            char c = s.charAt(i);
            if(inSt.contains(c))continue;
            while(!st.isEmpty() && c < st.peek() && i < last[st.peek() - 'a']){
                inSt.remove(st.pop());
            }
            st.push(c);
            inSt.add(c);
        }
        StringBuilder str = new StringBuilder();
        while(!st.isEmpty()){
            str.append(st.pop());
        }
        str.reverse();
        return str.toString();
    }
}
