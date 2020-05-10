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
    int xDepth = -1, yDepth = -1;
    TreeNode xp = null, yp = null;
    public boolean isCousins(TreeNode root, int x, int y) {
        getdp(root, x, y, 0, null);
        return xDepth == yDepth && xp != yp;
    }
    
    public void getdp (TreeNode root, int x, int y, int depth, TreeNode parent){
        if (root == null) return;
        if (root.val == x){
            xDepth = depth;
            xp = parent;
        }
        if (root.val == y){
            yDepth = depth;
            yp = parent;
        }
        getdp(root.left, x, y, depth + 1, root);
        getdp(root.right, x, y, depth + 1, root);
    }
}
