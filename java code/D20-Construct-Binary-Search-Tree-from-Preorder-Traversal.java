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
    public TreeNode bstFromPreorder(int[] preorder) {
        return bst(preorder, 0, preorder.length - 1);
    }
    
    public TreeNode bst (int[] preorder, int start, int end){
        if (start > end) return null;
        else{
            TreeNode root = new TreeNode (preorder[start]);
            int i;
            for (i = start; i <= end; i++){
                if (preorder[i] > root.val) break;
            }
            root.left = bst(preorder, start + 1, i - 1);
            root.right = bst(preorder, i, end);
            return root;
        }
    }
}
