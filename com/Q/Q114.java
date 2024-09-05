package com.Q;

import com.trees.TreeNode;

public class Q114 {
    public static void main(String[] args) {
        TreeNode root= new TreeNode(1);
        root.left= new TreeNode(2, new TreeNode(3), new TreeNode(4));
        root.right= new TreeNode(5,null, new TreeNode(6));

        Solution114 a= new Solution114();
        a.flatten(root);
    }
}

class Solution114 {
    TreeNode c=null;
    public void flatten(TreeNode root) {
        if(root==null) return;
        c=root;
        // attach(root);
        if(c.left!=null)attach(c.left);
        if(c.right!=null)attach(c.right);
    }
    public void attach(TreeNode n){
        if(n== null) return;
        c=n;
        if(n.left!=null)attach(n.left);
        if(n.right!=null)attach(n.right);
        c.right=n;
        c.left=null;
    }
}