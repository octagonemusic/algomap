class Solution {
    public int[] productExceptSelf(int[] nums) {
        int size = nums.length;
        int[] solution = new int[size];
        solution[0] = 1;
        for (int i = 1; i < size; i++) {
            solution[i] = solution[i - 1] * nums[i - 1];
        }
        int right = 1;
        for (int i = size - 1; i >= 0; i--) {
            solution[i] = solution[i] * right;
            right = right * nums[i];
        }
        return solution;
    }
}