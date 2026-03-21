class Solution {
    public int[] sortArrayByParityII(int[] nums) {
        int left =0;
        int right=1;
        int n=nums.length;
        while(right<n && left<n){
            if(nums[left]%2==0){
                left+=2;

            }else if(nums[right]%2!=0){
                right+=2;

            }else{
                int temp=nums[left];
                nums[left]=nums[right];
                nums[right]=temp;
            }
        }
        return nums;
    }
}