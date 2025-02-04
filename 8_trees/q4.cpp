#include <algorithm>
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
  int maxDiameter = 0;

  int pathLength(TreeNode *root) {
    if (!root) {
      return 0;
    }

    int maxLeftPath = pathLength(root->left);
    int maxRightPath = pathLength(root->right);

    maxDiameter = max(maxDiameter, maxLeftPath + maxRightPath);
    return 1 + max(maxLeftPath, maxRightPath);
  }

  int diameterOfBinaryTree(TreeNode *root) {
    pathLength(root);
    return maxDiameter;
  }
};
