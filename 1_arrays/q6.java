class Solution {
    public String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) {
            return "";
        }

        int shortest_length = Integer.MAX_VALUE;

        // Find the length of the shortest string
        for (String str : strs) {
            shortest_length = Math.min(str.length(), shortest_length);
        }

        StringBuilder common_prefix = new StringBuilder();

        // Compare characters
        for (int i = 0; i < shortest_length; i++) {
            char current_char = strs[0].charAt(i);
            for (int j = 1; j < strs.length; j++) {
                if (strs[j].charAt(i) != current_char) {
                    return common_prefix.toString();
                }
            }
            common_prefix.append(current_char);
        }

        return common_prefix.toString();
    }
}