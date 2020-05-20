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
    public int kthSmallest(TreeNode root, int k) {
        int count = 0;
        Stack<TreeNode> stack = new Stack<>();
        //The left most node = smallest, left -> root -> right will be the order
        while (root != null || !stack.isEmpty()){
            while (root != null){
                stack.push(root);
                root = root.left;
            }
            count++;
            root = stack.pop();
            int ans = root.val;
            if (count == k) return ans;
            else root = root.right;
        }
        return 0;
    }
}
