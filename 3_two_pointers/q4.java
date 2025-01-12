class Solution {
    public boolean isPalindrome(String s) {
        if (s == null || s.length() == 0)
            return true;

        char[] arr = new char[s.length()];
        int index = 0;

        // Convert to lowercase and filter non-alphanumeric characters in a single pass
        for (char c : s.toCharArray()) {
            if (Character.isLetterOrDigit(c)) {
                arr[index++] = Character.toLowerCase(c);
            }
        }

        // Use two pointers to check for palindrome
        int left = 0, right = index - 1;
        while (left < right) {
            if (arr[left] != arr[right]) {
                return false;
            }
            left++;
            right--;
        }

        return true;
    }
}
