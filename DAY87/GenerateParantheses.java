class Solution {
    List<String> list = new ArrayList<>();
    public void generate(int n , String str , int o , int c){
        if(str.length() == 2*n && o == n && c == n){
            list.add(str);
            return;
        }
        if(o<n){
            generate(n,str+"(" , o+1,c);
        }
        if(c < o){
            generate(n,str+")",o,c+1);
        }
        
    }
    public List<String> generateParenthesis(int n) {
        generate(n,"",0,0);
    return list;
    }
}
