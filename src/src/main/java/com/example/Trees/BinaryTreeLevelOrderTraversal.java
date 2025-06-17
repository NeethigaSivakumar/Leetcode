package com.example.Trees;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BinaryTreeLevelOrderTraversal {

    //Time O(N) Space O(N)
    public static List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> finalList=new ArrayList<>();
        if(root==null){
            return finalList;
        }
        Queue<TreeNode> q=new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()){
            int levels=q.size();
            List<Integer> subList=new ArrayList<>();
            for(int i=0;i<levels;i++){
                if(q.peek().left!=null){
                    q.add(q.peek().left);
                }
                if(q.peek().right!=null){
                    q.add(q.peek().right);
                }
                subList.add(q.remove().val);
            }
            finalList.add(subList);
        }
        return finalList;
    }

    public static void main(String[] args) {
        TreeNode leftNode1=new TreeNode(9,null,null);
        TreeNode leftNode2=new TreeNode(15,null,null);
        TreeNode rightNode2=new TreeNode(7,null,null);
        TreeNode rightNode1=new TreeNode(20,leftNode2,rightNode2);
        TreeNode root=new TreeNode(3,leftNode1,rightNode1);
        levelOrder(root);
    }

}