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
  bool pathSum(TreeNode *root, int sum, int targetSum) {
    if (!root) {
      return false;
    }

    sum = sum + root->val;

    if (sum == targetSum && !root->left && !root->right) {
      return true;
    }

    int leftSum = pathSum(root->left, sum, targetSum);
    int rightSum = pathSum(root->right, sum, targetSum);

    return leftSum || rightSum;
  }
  bool hasPathSum(TreeNode *root, int targetSum) {
    return pathSum(root, 0, targetSum);
  }
};
