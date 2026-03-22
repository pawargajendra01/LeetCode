class Solution {
    public int[] diStringMatch(String s) {
        int[] arr = new int[s.length()+1];
        int left=0;
        int right=s.length();
        char[] chars = s.toCharArray();
        for(int i=0;i<s.length();i++){
                if(chars[i]=='I'){
                    arr[i]=left++;
                }else{
                    arr[i]=right--;
                }
        }
        arr[s.length()]=right;
        return arr;
    }
}