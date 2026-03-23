/*class Solution {
    public int minDeletionSize(String[] strs) {
        int count=0;
        for(int i=0;i<strs[0].length();i++){
            for(int j=0;j<strs.length-1;j++){
                if(strs[j].charAt(i)>strs[j+1].charAt(i)){
                    count++;
                    break;
                }
            }
        }
        return count;
    }
}*/
class Solution {
    public int minDeletionSize(String[] strs) {
        int n = strs.length;
        int m = strs[0].length();
        int count = 0;

        // Pre-convert strings to char arrays to avoid .charAt() overhead
        char[][] grid = new char[n][m];
        for (int i = 0; i < n; i++) {
            grid[i] = strs[i].toCharArray();
        }

        for (int col = 0; col < m; col++) {
            for (int row = 1; row < n; row++) {
                // Accessing raw char arrays is faster than calling String methods
                if (grid[row][col] < grid[row - 1][col]) {
                    count++;
                    break;
                }
            }
        }

        return count;
    }
}