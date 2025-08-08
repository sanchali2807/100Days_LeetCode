class Solution {
    public int[] platesBetweenCandles(String s, int[][] queries) {
        int n = queries.length;
        int m = s.length();
        int idx = -1;
        int[] prefix = new int [m];
        int count = 0;
        int[] ans = new int[n];
        int [] nearestrightcandle = new int [m];
        int [] nearestleftcandle = new int [m];
        for(int i=0;i<s.length();i++){
             if(s.charAt(i) == '*'){
                count++;
                prefix[i] = count;
             }else{
                prefix[i] = count;
             }
        }
        for(int i=0;i<m;i++){
            if(s.charAt(i) =='|'){
                idx = i;
            }
            nearestleftcandle[i] = idx;
        }
        for(int i = s.length()-1;i>=0;i-- ){
            if(s.charAt(i) == '|'){
                idx = i;
            }
            nearestrightcandle[i] = idx;
        }

        for(int i=0;i<n;i++){
            int left = queries[i][0];
            int right = queries[i][1];
            int l = nearestrightcandle[left];
            int r = nearestleftcandle[right];
            if(l<0 || r<0 || l>=r)ans[i]=0;
            else{

            ans[i] = prefix[r] - prefix[l];
            }
       
        }
        return ans;
        
    }
}
