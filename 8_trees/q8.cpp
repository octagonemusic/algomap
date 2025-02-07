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
  bool isSameTree(TreeNode *root, TreeNode *other) {
    if (!root && !other) {
      return true;
    }

    if (!root || !other) {
      return false;
    }

    if (root->val != other->val) {
      return false;
    }

    return isSameTree(root->left, other->left) &&
           isSameTree(root->right, other->right);
  }

  bool isSubtree(TreeNode *root, TreeNode *subRoot) {
    if (!root) {
      return false;
    }

    if (!subRoot) {
      return true;
    }

    if (isSameTree(root, subRoot)) {
      return true;
    }

    return isSubtree(root->left, subRoot) || isSubtree(root->right, subRoot);
  }
};
