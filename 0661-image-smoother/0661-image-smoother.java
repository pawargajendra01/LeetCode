class Solution {
    public int[][] imageSmoother(int[][] img) {
        int[][] arr = new int[img.length][img[0].length];
        int r = img.length;
        int c = img[0].length;
        for (int i = 0; i < img.length; i++) {
            for (int j = 0; j < img[0].length; j++) {
                int sum = 0;
                int count = 0;
                for (int x = i-1; x <= i+1; x++) {
                    for (int y = j-1; y <= j+1; y++) {
                        if (x >= 0 && x < r && y >= 0 && y < c) {
                            sum += img[x][y];
                            count++;
                        }
                    }
                }
                int avg = sum / count;
                arr[i][j] = avg;
            }
        }
        return arr;

    }
}