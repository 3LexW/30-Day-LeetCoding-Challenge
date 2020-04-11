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
    public int diameterOfBinaryTree(TreeNode root) {
        if (root == null) return 0;                                                 //Base case
        //There are three possibilities
        int dia = depth(root.left) + depth(root.right);                             //Case 1: root is included in the longest diameter
        int ldia = diameterOfBinaryTree(root.left);                                 //Case 2: only left tree has the longest diameter
        int rdia = diameterOfBinaryTree(root.right);                                //Case 3: only right tree has the longest diameter
        return Math.max(dia, Math.max(ldia, rdia));
    }
    
    public int depth (TreeNode root){
        if (root == null) return 0;
        else return 1 + Math.max(depth(root.left), depth(root.right));
    }
}
