class Solution {
    public int[] sortedSquares(int[] nums) {
        int left=0;
        int right=nums.length-1;
        int current =nums.length-1;
        int[] arr = new int[nums.length];
        while(left<=right){
            int leftSquare = nums[left] * nums[left];
            int rightSquare = nums[right] * nums[right];
            
            if (leftSquare < rightSquare) {
                arr[current--] = rightSquare;
                right--;
            } else {
                arr[current--] = leftSquare;
                left++;
            }
        }
        return arr;
    }
}