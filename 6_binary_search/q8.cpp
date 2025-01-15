#include <bits/stdc++.h>
#include <climits>
#include <cmath>
using namespace std;

class Solution {
public:
  int minEatingSpeed(vector<int> &piles, int h) {
    int max_bananas = 0;

    for (int pile : piles) {
      max_bananas = max(max_bananas, pile);
    }

    int left = 1;
    int right = max_bananas;
    int k = INT_MAX;

    while (left <= right) {
      int mid = left + (right - left) / 2;

      long time_taken = 0;
      for (int pile : piles) {
        time_taken += (static_cast<long>(pile) + mid - 1) / mid;
      }

      if (time_taken <= h) {
        k = min(k, mid);
        right = mid - 1;
      } else {
        left = mid + 1;
      }
    }

    return k;
  }
};
