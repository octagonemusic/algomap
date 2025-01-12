import java.util.*;

class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> set = new HashSet<Integer>();
        for (int x : nums) {
            if (set.contains(x)) {
                return true;
            }

            set.add(x);
        }
        return false;
    }
}