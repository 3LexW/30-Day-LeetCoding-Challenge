/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    int max = Integer.MIN_VALUE;
    public int maxPathSum(TreeNode root) {
        //There are three possiblities
        //1. the root is within the path
        //2. only the left subtree contains the path
        //3. only the right subtree contains the path
        helper(root);
        return max;
    }
    
    public int helper (TreeNode root){
        if (root == null) return 0;
        int left = Math.max(helper(root.left), 0);
        int right = Math.max(helper(root.right), 0);
        
        //Root val is the root of the path
        max = Math.max(max, root.val + left + right);
        
        //Root is one of the nodes in the path
        return root.val + Math.max(left, right);
    }
}
