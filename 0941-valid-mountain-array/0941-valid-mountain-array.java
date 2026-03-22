class Solution {
    public boolean validMountainArray(int[] arr) {
        if(arr.length<3){
            return false;
        }
        if(arr[arr.length-1]>arr[arr.length-2]||arr[0]>arr[1]){
            return false;
        }
        boolean increasing = true;
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]<arr[i+1] && increasing){
                
            }
            else if(arr[i]>arr[i+1]){
                increasing = false;
            }
            else{
                return false;
            }
        }
        return true;
    }
}