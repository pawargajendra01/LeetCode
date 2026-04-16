class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        HashMap<Integer,Integer> map = new HashMap<>();
        HashSet<Integer> set = new HashSet<>();
        for(int ar:arr){
            map.put(ar, map.getOrDefault(ar, 0) + 1);
        }
        for(int ar:arr){
            set.add(map.get(ar));
        }
        return !(map.size()>set.size());
    }
}