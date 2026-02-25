class Solution {
    public int maxArea(int[] height) {
        int maxArea = 0;

        for (int left = 0, right = height.length - 1; left < right;) {

            int h = Math.min(height[left], height[right]);
            int width = right - left;
            maxArea = Math.max(maxArea, h * width);

            if (height[left] < height[right]) {
                left++;
            } else {
                right--;
            }
        }

        return maxArea;
    }
}