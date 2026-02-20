class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        int r1=0;
        int c1=0;
        if(mat.length * mat[0].length == r*c){
            int[][] matn =new int[r][c];
            for(int i=0;i<r;i++){
                for(int j=0;j<c;j++){
                    matn[i][j] = mat[r1][c1];
                    if(c1<mat[0].length-1){
                        c1++;
                    }else{
                        c1=0;
                        r1++;
                    }
                }
            }
            return matn;
        }
        return mat;
    }
}