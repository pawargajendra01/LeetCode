class Solution {
    public boolean isAlienSorted(String[] words, String order) {
        HashMap<Character,Integer> map = new HashMap<>();
        int value=0;
        for(char i:order.toCharArray()){
            map.put(i,value);
            value++;
        }
        int length=0;
        for(int i=1;i<words.length;i++){
            length=Math.min(words[i-1].length(),words[i].length());
            int count =0;
            for(int j=0;j<length;j++){
                if(map.get(words[i-1].charAt(j))<map.get(words[i].charAt(j))){
                    break;
                }
                else if(map.get(words[i-1].charAt(j))>map.get(words[i].charAt(j))){
                    return false;
                }
                else{
                    count++;
                }
            }
            if(words[i-1].length()>words[i].length() && count==length){
                return false;
            }
        }
        return true;
    }
}