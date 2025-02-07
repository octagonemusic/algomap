#include <bits/stdc++.h>
#include <queue>

using namespace std;

struct TreeNode {
  int val;
  TreeNode *left;
  TreeNode *right;
  TreeNode() : val(0), left(nullptr), right(nullptr) {}
  TreeNode(int x) : val(x), left(nullptr), right(nullptr) {}
  TreeNode(int x, TreeNode *left, TreeNode *right)
      : val(x), left(left), right(right) {}
};

class Solution {
public:
  vector<vector<int>> levelOrder(TreeNode *root) {
    vector<vector<int>> res = {};
    if (!root) {
      return res;
    }

    queue<TreeNode *> q;
    q.push(root);

    while (!q.empty()) {
      vector<int> level = {};
      int nodes = q.size();

      for (int i = 0; i < nodes; i++) {
        TreeNode *latest = q.front();
        q.pop();
        level.push_back(latest->val);

        if (latest->left) {
          q.push(latest->left);
        }

        if (latest->right) {
          q.push(latest->right);
        }
      }

      if (!level.empty()) {
        res.push_back(level);
      }
    }

    return res;
  }
};
