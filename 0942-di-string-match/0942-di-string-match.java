class Solution {
    public int[] diStringMatch(String s) {
        int[] arr = new int[s.length()+1];
        int left=0;
        int right=s.length();
        for(int i=0;i<s.length();i++){
                if(s.charAt(i)=='I'){
                    arr[i]=left;
                    left++;
                }else{
                    arr[i]=right;
                    right--;
                }
        }
        arr[s.length()]=right;
        return arr;
    }
}