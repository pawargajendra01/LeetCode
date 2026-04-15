class Solution {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        Arrays.sort(arr);
        List<List<Integer>> list =new ArrayList<>();
        int minDiff = Integer.MAX_VALUE;

        for(int i=1;i<arr.length;i++){
            if((arr[i]-arr[i-1])<minDiff){
                minDiff = arr[i]-arr[i-1];
            }
        }
        for(int i=1;i<arr.length;i++){
            if((arr[i]-arr[i-1])==minDiff){
                List<Integer> listr= new ArrayList<>();
                listr.add(arr[i-1]);
                listr.add(arr[i]);
                list.add(listr);
            }
        }
        return list;
    }
}