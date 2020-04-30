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
    int[] arr;
    public boolean isValidSequence(TreeNode root, int[] arr) {
        this.arr = arr;
        return isValid(root, 0);
    }
    
    public boolean isValid(TreeNode root, int cur){
        if (root == null) return false;
        if (root.val == arr[cur]){
            if (cur == arr.length - 1) return root.left == null && root.right == null;
            else return isValid(root.left, cur + 1) || isValid(root.right, cur + 1);
        }
        else return false;
    }
}
