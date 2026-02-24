class Solution {
    public int maximumProduct(int[] nums) {
        Arrays.sort(nums);
        int l = nums.length;
        int num1 = nums[0]*nums[1]*nums[l-1];
        int num2 = nums[l-1]*nums[l-2]*nums[l-3];
        if(num1>num2){
            return num1;
        }
        else
        return num2;
    }
}