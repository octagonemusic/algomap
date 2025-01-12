class Solution {
    public int trap(int[] height) {
        int water = 0;

        int left = 0;
        int right = height.length - 1;

        int maxLeft = height[left];
        int maxRight = height[right];

        while (left < right) {
            if (maxLeft <= maxRight) {
                left++;
                maxLeft = Math.max(height[left], maxLeft);
                water += maxLeft - height[left];
            } else {
                right--;
                maxRight = Math.max(height[right], maxRight);
                water += maxRight - height[right];
            }
        }

        return water;
    }
}