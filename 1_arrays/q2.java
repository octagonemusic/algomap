class Solution {
    public String mergeAlternately(String word1, String word2) {
        StringBuilder soln = new StringBuilder();

        int word1length = word1.length();
        int word2length = word2.length();

        int maxlength = word1length > word2length ? word1length : word2length;

        for (int i = 0; i < maxlength; i++) {
            if (i < word1length) {
                soln.append(word1.charAt(i));
            }

            if (i < word2length) {
                soln.append(word2.charAt(i));
            }
        }

        return soln.toString();
    }
}