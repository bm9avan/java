package com.Q;

import com.trees.TreeNode;

public class Q98 {
    public static void main(String[] args) {
        TreeNode root= new TreeNode(2);
        root.left= new TreeNode(1);
        root.right= new TreeNode(3);

        Solution a= new Solution();
        System.out.println(a.isValidBST(root));
    }
}
class Solution {
    public boolean isValidBST(TreeNode root) {
        return check(root, null, null);
    }

    public boolean check(TreeNode n, Integer min, Integer max) {
//        if (n != null) {
//            if (n.val < max & n.val > min)
//                return check(n.left, min, n.val) & check(n.right, n.val, max);
//            else return false;
//        }
//        return true;
        if(n==null)return true;
        if(min!=null && n.val<=min)
            return false;
        if(max!=null && n.val>=max)
            return false;

        return check(n.left, min, n.val) & check(n.right, n.val, max);
    }
}