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
            for (int j = 1; j <= freq; j++){
                arr[num]=val;
                num++;
            }
        }
        return arr;
        /*ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < nums.length - 1; i+=2) {
            int freq = nums[i];
            int val = nums[i + 1];
            for (int j = 1; j <= freq; j++) {
                list.add(val);
            }
        }
        int[] result = new int[list.size()];
        int count=0;
        for (int i:list) {
            result[count] = i;
            count++;
        }
        return result;*/
    }
}