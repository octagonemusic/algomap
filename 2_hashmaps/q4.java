import java.util.*;

class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }

        int[] sfreq = new int[26];
        int[] tfreq = new int[26];

        for (int i = 0; i < s.length(); i++) {
            sfreq[(int) s.charAt(i) - 97]++;
        }

        for (int i = 0; i < t.length(); i++) {
            tfreq[(int) t.charAt(i) - 97]++;
        }

        if (Arrays.equals(sfreq, tfreq)) {
            return true;
        } else {
            return false;
        }
    }
}