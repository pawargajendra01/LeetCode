class Solution {
    public int numUniqueEmails(String[] emails) {
        HashSet<String> set = new HashSet<>();
        StringBuilder sb = new StringBuilder();
        for (String i : emails) {
            boolean plus = false;
            for (int j = 0; j < i.length(); j++) {
                if(i.charAt(j)=='@'){
                    sb.append(i.substring(j));
                    break;
                }
                else if(i.charAt(j)=='+'){
                    plus = true;
                }
                else if(i.charAt(j)!='.' && !plus){
                    sb.append(i.charAt(j));
                }
                else if(i.charAt(j)=='@'){
                    sb.append(i.substring(j));
                    break;
                }
            }
            set.add(sb.toString());
            sb.setLength(0);
        }
        return set.size();
    }
}