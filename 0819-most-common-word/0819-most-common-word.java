import java.util.*;

class Solution {
    public String mostCommonWord(String paragraph, String[] banned) {
        Set<String> bannedSet = new HashSet<>();
        for (String word : banned) {
            bannedSet.add(word);
        }

        Map<String, Integer> map = new HashMap<>();
        StringBuilder sb = new StringBuilder();
        String result = "";
        int max = 0;

        for (int i = 0; i < paragraph.length(); i++) {
            char c = paragraph.charAt(i);
            if (Character.isLetter(c)) {
                sb.append(Character.toLowerCase(c));
                if (i != paragraph.length() - 1) continue;
            }

            if (sb.length() > 0) {
                String word = sb.toString();
                if (!bannedSet.contains(word)) {
                    map.put(word, map.getOrDefault(word, 0) + 1);
                    if (map.get(word) > max) {
                        max = map.get(word);
                        result = word;
                    }
                }
                sb.setLength(0);
            }
        }

        return result;
    }
}