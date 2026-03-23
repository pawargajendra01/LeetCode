/*class Solution {
    public int minDeletionSize(String[] strs) {
        int count=0;
        for(int i=0;i<strs[0].length();i++){
            for(int j=0;j<strs.length-1;j++){
                if(strs[j].charAt(i)>strs[j+1].charAt(i)){
                    count++;
                    break;
                }
            }
        }
        return count;
    }
}*/
class Solution {
    public int minDeletionSize(String[] strs) {
        int n = strs.length;
        int m = strs[0].length();
        int count = 0;

        for (int col = 0; col < m; col++) {
            for (int row = 1; row < n; row++) {
                if (strs[row].charAt(col) < strs[row - 1].charAt(col)) {
                    count++;
                    break;
                }
            }
        }

        return count;
    }
}