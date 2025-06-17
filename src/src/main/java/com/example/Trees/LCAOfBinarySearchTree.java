package com.example.Trees;

public class LCAOfBinarySearchTree {

    //Time O(H) Space O(1)
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        while (root != null) {
            if (p.val>root.val && q.val>root.val) {
                root=root.right;
            }
            else if (p.val<root.val && q.val<root.val) {
                root=root.left;
            }
            else{
                return root;
            }
        }
        return null;
    }
}
