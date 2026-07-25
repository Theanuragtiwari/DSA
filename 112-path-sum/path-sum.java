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
    public boolean hasPathSum(TreeNode root, int targetSum) {
        if(root == null ) return false;
        if(root.left == null && root.right == null) return root.val == targetSum;             
        boolean leftSum = rootSum(root.left,root.val,targetSum);
        boolean rightSum = rootSum(root.right,root.val,targetSum);
        return leftSum || rightSum;
    }
    private boolean rootSum(TreeNode root, int currentSum,int targetSum) {
        if(root == null) return false;

        currentSum += root.val;
        if(root.left == null && root.right == null) return currentSum == targetSum;
        return rootSum(root.left,currentSum,targetSum) ||rootSum(root.right,currentSum,targetSum);
    }
}