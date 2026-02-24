class Solution {
    public double findMaxAverage(int[] nums, int k) {
        double sum=0;
        for(int i=0;i<k;i++){
            sum=sum+nums[i]; 
        }
        double result = sum/k;
        for(int j=k;j<nums.length;j++){
            sum += nums[j] - nums[j-k];
            double avg =sum/k;
            result = Math.max(result,avg);
        }
        return result;
    }
}