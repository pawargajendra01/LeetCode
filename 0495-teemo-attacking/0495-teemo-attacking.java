class Solution {
    public int findPoisonedDuration(int[] timeSeries, int duration) {
        int count = 0;
        for (int i = 0; i < timeSeries.length-1; i++) {
            for (int j = timeSeries[i]; j < timeSeries[i] + duration; j++) {
                if (j == timeSeries[i + 1]) {
                    break;
                }
                count++;
            }
        }
        return count+duration;
    }
}