#include <bits/stdc++.h>
using namespace std;

class Solution {
public:
  int longestOnes(vector<int> &nums, int k) {
    int longest_soln = 0;
    int left = 0;
    int right = 0;
    int zeros = 0;

    while (right < nums.size()) {
      if (nums[right] == 0) {
        zeros++;
      }

      while (zeros > k) {
        if (nums[left] == 0) {
          zeros--;
        }
        left++;
      }

      longest_soln = max((right - left + 1), longest_soln);
      right++;
    }
    return longest_soln;
  }
};
