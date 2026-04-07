class Solution {
    public int distanceBetweenBusStops(int[] distance, int start, int destination) {
        int dist1 = 0;
        int dist2 = 0;
        
        int s = Math.min(start, destination);
        int d = Math.max(start, destination);
        
        for (int i = 0; i < distance.length; i++) {
            if (i >= s && i < d) {
                dist1 += distance[i];
            } else {
                dist2 += distance[i];
            }
        }
        
        return Math.min(dist1, dist2);
    }
}