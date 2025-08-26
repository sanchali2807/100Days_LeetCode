class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        int n = mat.length;
        int m = mat[0].length;
        if(n*m != r*c)return mat;
        List<Integer> list = new ArrayList<>();
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                list.add(mat[i][j]);
            }
        }
       int[][] res = new int[r][c];
        int index = 0;
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                res[i][j] = list.get(index);
                index++;
            }
        }
        return res;
    }
}
