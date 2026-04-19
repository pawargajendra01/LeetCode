class Solution {
    public int oddCells(int m, int n, int[][] indices) {
        int[][] arr = new int[m][n];
        int ind = 0;
        for (int j = 0; j < indices.length ; j++) {
            for (int k = 0; k < n; k++) {
                arr[indices[j][0]][k]++;
            }
            for (int l = 0; l < m; l++) {
                arr[l][indices[j][1]]++;
            }
        }
        int count = 0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (arr[i][j] % 2 != 0) {
                    count++;
                }
            }
        }
        return count;
    }
}