class Solution {
    public boolean isSubsequence(String s, String t) {
        char[] s_array = s.toCharArray();
        char[] t_array = t.toCharArray();
        int s_length = s_array.length;
        int t_length = t_array.length;

        if (s_length == 0) {
            return true;
        }

        if (s_length > t_length) {
            return false;
        }

        int i = 0;
        int j = 0;

        while (i < s_length && j < t_length) {
            if (s_array[i] == t_array[j]) {
                i++;
            }
            j++;
        }

        if (i == s_length) {
            return true;
        } else {
            return false;
        }
    }
}