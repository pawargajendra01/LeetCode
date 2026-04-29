import java.util.*;

class Solution {
    public int[] kWeakestRows(int[][] mat, int k) {
        int rows = mat.length;
        int[][] rowStrengths = new int[rows][2];

        for (int i = 0; i < rows; i++) {
            rowStrengths[i][0] = countSoldiers(mat[i]);
            rowStrengths[i][1] = i;
        }

        Arrays.sort(rowStrengths, (a, b) -> {
            if (a[0] != b[0]) return a[0] - b[0];
            return a[1] - b[1];
        });

        int[] result = new int[k];
        for (int i = 0; i < k; i++) {
            result[i] = rowStrengths[i][1];
        }

        return result;
    }

    private int countSoldiers(int[] row) {
        int low = 0, high = row.length;
        while (low < high) {
            int mid = low + (high - low) / 2;
            if (row[mid] == 1) low = mid + 1;
            else high = mid;
        }
        return low;
    }
}