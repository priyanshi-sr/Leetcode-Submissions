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
    public int maxSumBST(TreeNode root) {
         return ValidBst(root).ans;
}      public BstPair ValidBst(TreeNode root){
        if(root==null){
            return new BstPair();
        }
        BstPair lbp = ValidBst(root.left);
        BstPair rbp = ValidBst(root.right);
        BstPair sbp = new BstPair();
        sbp.min = Math.min(lbp.min,Math.min(rbp.min,root.val));
        sbp.max = Math.max(lbp.max,Math.max(rbp.max,root.val));
        sbp.sum = lbp.sum+rbp.sum+root.val;
        sbp.isBst = lbp.isBst && rbp.isBst && root.val>lbp.max && root.val<rbp.min;
        if(sbp.isBst){
            sbp.ans = Math.max(lbp.ans,Math.max(rbp.ans,sbp.sum));
        }
        else{
            sbp.ans = Math.max(lbp.ans,rbp.ans);
        }
        return sbp;
    }
    class BstPair{
        long min = Long.MAX_VALUE;
        long max = Long.MIN_VALUE;
        boolean isBst = true;
        int sum = 0;
        int ans = 0;

    }
}
