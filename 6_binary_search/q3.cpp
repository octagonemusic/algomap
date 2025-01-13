#include <bits/stdc++.h>
using namespace std;

bool isBadVersion(int version);

class Solution {
public:
  int firstBadVersion(int n) {
    int low = 1;
    int high = n;

    while (low < high) {
      int mid = low + (high - low) / 2;
      bool version = isBadVersion(mid);

      if (version == true) {
        high = mid;
      } else {
        low = mid + 1;
      }
    }

    return low;
  }
};
