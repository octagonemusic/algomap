import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<String> summaryRanges(int[] nums) {
        List<String> soln = new ArrayList<String>();
        if (nums.length == 0)
            return soln; // Handle empty array case
        int a = nums[0];
        @SuppressWarnings("unused")
        int b = nums[0];
        for (int i = 0; i < nums.length; i++) {
            StringBuilder range = new StringBuilder();
            if (i == nums.length - 1) { // Handle the last element
                if (a == nums[i]) {
                    range.append(a);
                } else {
                    range.append(a + "->" + nums[i]);
                }
                soln.add(range.toString());
            } else if (nums[i] + 1 != nums[i + 1]) {
                if (a == nums[i]) {
                    range.append(a);
                } else {
                    range.append(a + "->" + nums[i]);
                }
                soln.add(range.toString());
                a = nums[i + 1];
                b = nums[i + 1];
            } else {
                b = nums[i];
            }
        }
        return soln;
    }
}