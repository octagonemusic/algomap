import java.util.*;

class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> map = new HashMap<>();

        for (String str : strs) {
            char[] strArray = str.toCharArray();
            char[] freq = new char[26];
            for (char c : strArray) {
                freq[c - 'a']++;
            }

            String key = String.valueOf(freq);

            if (map.containsKey(key)) {
                map.get(key).add(str);
            } else {
                map.put(key, new ArrayList<>(Arrays.asList(str)));
            }
        }

        return new ArrayList<>(map.values());
    }
}