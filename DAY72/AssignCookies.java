class Solution {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        int count= 0 ;
          boolean[] used = new boolean[s.length];
        for(int i=0;i<g.length;i++){
            for(int j=0;j<s.length;j++){
                if(!used[j] && s[j]>=g[i]){
                    count++;
                    used[j] = true;
                    break;
                }
            }
        }
        return count;
    }
}
