class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        int[] charCounts = new int[26]; // Array for 26 lowercase letters

        // Build character counts from magazine
        for (char c : magazine.toCharArray()) {
            charCounts[c - 'a']++;
        }

        // Check if ransomNote can be constructed
        for (char c : ransomNote.toCharArray()) {
            if (--charCounts[c - 'a'] < 0) {
                return false;
            }
        }

        return true; // All characters found
    }
}
