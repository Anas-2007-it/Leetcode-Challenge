/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    TreeNode prev = null;
    TreeNode ans = null;
    public TreeNode increasingBST(TreeNode root) {
        inorder(root);
        return ans;
    }
    public void inorder(TreeNode root) {
        if (root == null)
            return;
        inorder(root.left);

        if (prev == null)
            ans = root;
        else {
            prev.right = root;
            prev.left = null;
        }
        root.left = null;
        prev = root;
        inorder(root.right);
    }
}