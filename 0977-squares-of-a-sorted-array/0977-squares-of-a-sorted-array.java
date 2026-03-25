class Solution {
    public int[] sortedSquares(int[] nums) {
        int left=0;
        int right=nums.length-1;
        int current =nums.length-1;
        int[] arr = new int[nums.length];
        while(left<=right){
            if(nums[left]*nums[left]<nums[right]*nums[right]){
                arr[current--]=nums[right]*nums[right];
                right--;
            }
            else{
                arr[current--]=nums[left]*nums[left];
                left++;
            }
        }
        return arr;
    }
}