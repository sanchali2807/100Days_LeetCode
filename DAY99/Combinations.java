class Solution {
    List<List<Integer>> res = new ArrayList<>();
    public void fun(int st,int n , int k , List<Integer> list){
        if(k == 0){
            res.add(new ArrayList<>(list));
            return;
        }
        for(int i=st;i<=n;i++){
            list.add(i);
            fun(i+1,n,k-1,list);
            list.remove(list.size()-1);
        }

    }
    public List<List<Integer>> combine(int n, int k) {
        fun(1,n,k,new ArrayList<>());
    return res;
    }
}
