import java.util.Arrays;

class Solution {
    public int longestConsecutive(int[] nums) {
        if (nums == null || nums.length == 0)
            return 0;
        Arrays.sort(nums);// O(nlgn);
        int curr = nums[0];
        int sum = 1;
        int ans = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == nums[i - 1])
                continue;
            if (nums[i] == curr + 1) {
                curr++;
                sum++;
                ans = Math.max(ans, sum);
            } else {
                curr = nums[i];
                sum = 1;
            }
        }
        return ans;
    }
}
