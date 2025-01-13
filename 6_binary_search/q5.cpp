#include <bits/stdc++.h>
using namespace std;

class Solution {
public:
  bool searchMatrix(vector<vector<int>> &matrix, int target) {
    int m = matrix.size();
    int n = matrix[0].size();

    // Handle edge case when the matrix is a single element
    if (m == 1 && n == 1) {
      return matrix[0][0] == target;
    }

    int i = 0;
    while (i < m) {
      if (target == matrix[i][n - 1] || target == matrix[i][0]) {
        return true;
      } else if (target < matrix[i][n - 1]) {
        break;
      }
      i++;
    }

    // Ensure valid row index after the loop
    if (i >= m) {
      return false;
    }

    int low = 0;
    int high = n - 1;
    while (low <= high) {
      int mid = low + (high - low) / 2;
      if (matrix[i][mid] == target) {
        return true;
      } else if (target < matrix[i][mid]) {
        high = mid - 1;
      } else {
        low = mid + 1;
      }
    }
    return false;
  }
};
