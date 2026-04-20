class Solution {
    public List<List<Integer>> shiftGrid(int[][] grid, int k) {
        int m = grid.length;
        int n = grid[0].length;
        int total = m * n;
        k = k % total;
        
        Integer[] flat = new Integer[total];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                int oldPos = i * n + j;
                int newPos = (oldPos + k) % total;
                flat[newPos] = grid[i][j];
            }
        }
        
        List<List<Integer>> result = new ArrayList<>();
        for (int i = 0; i < m; i++) {
            List<Integer> row = new ArrayList<>();
            for (int j = 0; j < n; j++) {
                row.add(flat[i * n + j]);
            }
            result.add(row);
        }
        
        return result;
    }
}