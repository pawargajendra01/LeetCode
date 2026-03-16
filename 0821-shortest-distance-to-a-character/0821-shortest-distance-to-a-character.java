class Solution {
    public int[] shortestToChar(String s, char c) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        int[] array = new int[s.length()];

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == c) {
                arrayList.add(i);
            }
        }
        for (int i = 0; i < s.length(); i++) {
            int sum = Integer.MAX_VALUE;
            for (int j = 0; j < arrayList.size(); j++) {
                    sum = Math.min(sum,Math.abs(i - arrayList.get(j)));
            }
            array[i] = sum;
        }
        return array;
    }
}