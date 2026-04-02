public class Solution {
    private int height(TreeNode root, bool[] ret){
        if(root == null || !ret[0]){
            return(0);
        }

        int left = height(root.left, ret);
        int right = height(root.right, ret);
        if(Math.Abs(left - right) >= 2){
            ret[0] = false;
        }
        return(1 + Math.Max(left, right));
    }

    public bool IsBalanced(TreeNode root) {
        bool[] ret = {true};
        height(root, ret);
        return(ret[0]);
    }
}
