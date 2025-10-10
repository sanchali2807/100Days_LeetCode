class Solution {
    public void fun(Stack<Integer>st){
        if(st.isEmpty())return;
        int ele = st.pop();
        fun(st);
        insert(st,ele);
    }
    public void insert(Stack<Integer>st,int ele){
        if(st.isEmpty() || st.peek() <= ele){
            st.push(ele);
            return;
        }
        int element = st.pop();
        insert(st,ele);
        st.push(element);
    }
    public void sortStack(Stack<Integer> st) {
        fun(st);
    }
}
