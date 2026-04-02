# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution:
    def height(self, root, ret):
        if not root or not ret[0]:
            return 0
        
        left = self.height(root.left, ret)
        right = self.height(root.right, ret)
        if abs(left - right) > 1:
            ret[0] = False
        return 1 + max(left, right)

    def isBalanced(self, root):
        ret = [True]
        self.height(root, ret)
        return ret[0]
