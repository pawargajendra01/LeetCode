class Solution {
    public int[] decompressRLElist(int[] nums) {
        int count=0;
        for(int i=0;i<nums.length;i+=2){
            count+=nums[i];
        }
        int[] arr=new int[count];
        int num=0;
        for (int i = 0; i < nums.length; i+=2) {
            int freq = nums[i];
            int val = nums[i+1];
            Arrays.fill(arr, num, num + freq, val);
            num += freq;
        }
        return arr;
    }
}