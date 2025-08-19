class Solution {
    public int[][] merge(int[][] it) {
        List<int[] > merged = new ArrayList<>();
        Arrays.sort(it,(a,b) -> Integer.compare(a[0],b[0]));

        int [] prev= it[0];
        for(int i=1;i<it.length;i++){
            int[] curr = it[i];
            if(prev[1]>=curr[0]){
                prev[1] = Math.max(prev[1],curr[1]);
            }else{
                merged.add(prev);
                prev = curr;
            }
        }
        merged.add(prev);
        return merged.toArray(new int[merged.size()][]);
    }
}
