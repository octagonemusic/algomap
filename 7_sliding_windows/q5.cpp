#include <bits/stdc++.h>
using namespace std;

class Solution {
public:
  int minSubArrayLen(int target, vector<int> &nums) {
    int minLen = nums.size();
    int left = 0;
    int right = 0;
    int currSum = 0;
    int currLen = right - left + 1;

    while (right < nums.size() && left < nums.size()) {

      while (currSum < target && right < nums.size()) {
        currSum += nums[right];
        currLen++;
        right++;
      }

      if (currSum < target && right == nums.size() && left == 0) {
        return 0;
      }

      minLen = min(minLen, currLen);

      while (currSum >= target) {
        currSum -= nums[left];
        left++;
        currLen--;
      }
      minLen = min(minLen, currLen);
    }
    return minLen;
  }
};
