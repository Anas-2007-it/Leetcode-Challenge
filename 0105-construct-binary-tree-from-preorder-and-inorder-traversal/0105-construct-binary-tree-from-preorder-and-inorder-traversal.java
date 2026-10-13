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
    int index = 0;

    public TreeNode buildTree(int[] preorder, int[] inorder) {
        return build(preorder, inorder, 0, inorder.length - 1);
    }

    public TreeNode build(int[] preorder, int[] inorder, int start, int end) {
        if (start > end) {
            return null;
        }
        int rootValue = preorder[index++];
        TreeNode root = new TreeNode(rootValue);
        int i = start;
        while (inorder[i] != rootValue) {
            i++;
        }
        root.left = build(preorder, inorder, start, i - 1);
        root.right = build(preorder, inorder, i + 1, end);

        return root;
    }
}
