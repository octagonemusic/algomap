#include <bits/stdc++.h>
#include <cstring>
#include <string>
using namespace std;

class Solution {
public:
  bool checkInclusion(string s1, string s2) {
    if (s1.length() > s2.length()) {
      return false;
    }

    int freq[26] = {0};
    int window_freq[26] = {0};

    for (char c : s1) {
      freq[c - 'a']++;
    }

    int left = 0;
    int right = 0;

    while (right < s1.length()) {
      window_freq[s2[right] - 'a']++;
      right++;
    }

    while (right < s2.length()) {
      if (memcmp(freq, window_freq, sizeof(freq)) == 0) {
        return true;
      }

      window_freq[s2[left] - 'a']--;
      left++;
      window_freq[s2[right] - 'a']++;
      right++;
    }

    if (memcmp(freq, window_freq, sizeof(freq)) == 0) {
      return true;
    }

    return false;
  }
};
