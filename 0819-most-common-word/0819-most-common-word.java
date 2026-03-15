class Solution {
    public String mostCommonWord(String paragraph, String[] banned) {

        HashSet<String> set = new HashSet<>();
        for (int i = 0; i < banned.length; i++) {
            set.add(banned[i]);
        }

        StringBuilder sb = new StringBuilder();
        HashMap<String, Integer> map = new HashMap<>();

        for (int i = 0; i < paragraph.length(); i++) {

            char c = Character.toLowerCase(paragraph.charAt(i));
            if (Character.isLetter(c)) {
                sb.append(c);
            }

            else if (sb.length()>0) {
                if (!set.contains(sb.toString())) {
                    map.put(sb.toString(), map.getOrDefault(sb.toString(), 0) + 1);
                }
                sb.setLength(0);
            }
            if (i== paragraph.length()-1 && c != '.' && c != '!') {
                if (!set.contains(sb.toString())) {
                    map.put(sb.toString(), map.getOrDefault(sb.toString(), 0) + 1);
                }
                sb.setLength(0);
            }
        }

        String maxWord = "";
        int maxFreq = 0;

        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            if (entry.getValue() > maxFreq) {
                maxFreq = entry.getValue();
                maxWord = entry.getKey();
            }
        }

        return maxWord;
    }
}