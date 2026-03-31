class Solution {
    public List<String> commonChars(String[] words) {
        ArrayList<String> list = new ArrayList<>();
        for(int j=0;j<words[0].length();j++){
            list.add(Character.toString(words[0].charAt(j)));
        }
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<words.length;i++){
            sb.append(words[i]);
            for(int j=0;j<list.size();j++){
                boolean found = false;
                for(int k=0;k<sb.length();k++){
                    if(list.get(j).charAt(0)==sb.charAt(k)){
                        found=true;
                        sb.setCharAt(k, '*');
                        break;
                    }
                }
                if(!found){
                    list.remove(j);
                    j--;
                }
            }
            sb.setLength(0);
        }
        return list;
    }
}