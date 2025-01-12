import java.util.*;

class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int[] ansArr = new int[2];

        for (int i = 0; i < nums.length; i++) {
            int secondNumber = target - nums[i];
            if (map.containsKey(secondNumber)) {
                ansArr[0] = i;
                ansArr[1] = map.get(secondNumber);
                return ansArr;
            }
            map.put(nums[i], i);
        }
        return ansArr;
    }
}