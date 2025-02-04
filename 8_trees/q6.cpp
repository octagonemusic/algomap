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
  bool sameTree(TreeNode *leftTree, TreeNode *rightTree) {
    if (!leftTree && !rightTree) {
      return true;
    }

    if (!leftTree || !rightTree) {
      return false;
    }

    if (leftTree->val != rightTree->val) {
      return false;
    }

    return sameTree(leftTree->left, rightTree->right) &&
           sameTree(leftTree->right, rightTree->left);
  }
  bool isSymmetric(TreeNode *root) { return sameTree(root, root); }
};
