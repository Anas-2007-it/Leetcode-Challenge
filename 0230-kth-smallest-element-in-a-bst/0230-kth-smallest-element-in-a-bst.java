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
    int res = 0;
    int count = 0;
    public int kthSmallest(TreeNode root, int k) {
        small(root, k);
        return res;
    }
    void small(TreeNode root, int k) {
        if (root == null) return;
        small(root.left, k);
        count++;
        if (count == k) {
            res = root.val;
            return;
        }
        small(root.right, k);
    }
}