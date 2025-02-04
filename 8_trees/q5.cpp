#include <bits/stdc++.h>
#include <vector>
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
  bool DFS(TreeNode *root, TreeNode *other) {
    if (!root && !other) {
      return true;
    }

    if (!root || !other) {
      return false;
    }

    if (root->val != other->val) {
      return false;
    }

    return DFS(root->left, other->left) && DFS(root->right, other->right);
  }
  bool isSameTree(TreeNode *p, TreeNode *q) { return DFS(p, q); }
};
