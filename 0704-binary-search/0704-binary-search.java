class Solution {
    public int search(int[] nums, int target) {

        boolean found =false;

        for(int i=0;i<nums.length;i++){
            if(nums[i]==target){
                found = true;
                return i;
            }
        }

        if(!found){
            return - 1;
        }
        else
            return 0;
    }
}