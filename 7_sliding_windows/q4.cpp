#include <bits/stdc++.h>
#include <string>
#include <unordered_map>
using namespace std;

class Solution {
public:
  int characterReplacement(string s, int k) {
    int longest = 0;
    int left = 0;
    int right = 0;
    int maxFreq = 0;
    unordered_map<char, int> map;

    while (right < s.size()) {
      map[s[right]]++;
      maxFreq = max(maxFreq, map[s[right]]);
      while ((right - left + 1) - maxFreq > k) {
        map[s[left]]--;
        left++;
      }

      longest = max(right - left + 1, longest);
      right++;
    }

    return longest;
  }
};
