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
    private int height(TreeNode root, boolean[] ret){
        if(root == null || !ret[0]){
            return(0);
        }

        int left = height(root.left, ret);
        int right = height(root.right, ret);
        if(Math.abs(left - right) >= 2){
            ret[0] = false;
        }
        return(1 + Math.max(left, right));
    }

    public boolean isBalanced(TreeNode root) {
        boolean[] ret = {true};
        height(root, ret);
        return(ret[0]);
    }
}
