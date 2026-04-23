class Solution {
    public int findSpecialInteger(int[] arr) {
        int num =arr.length/4;

        HashMap<Integer,Integer> map=new HashMap<>();
        for(int ar:arr){
            map.put(ar,map.getOrDefault(ar,0)+1);
        }
        for(int mp:map.keySet()){
            if(map.get(mp)>num){
                return mp;
            }
        }
        return -1;
    }
}