#include <bits/stdc++.h>
#include <string>
#include <unordered_map>
using namespace std;

class Solution {
public:
  int lengthOfLongestSubstring(string s) {
    int longest = 0;
    int left = 0;
    int right = 0;

    unordered_map<char, int> map;

    while (right < s.size()) {
      if ((map.count(s[right])) && map[s[right]] >= left) {
        left = map[s[right]] + 1;
      }
      map[s[right]] = right;
      longest = max(longest, right - left + 1);
      right++;
    }
    return longest;
  }
};
