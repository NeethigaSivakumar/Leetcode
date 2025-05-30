package com.example.Trees;

import java.util.*;


public class TopViewBinaryTree {
    private List<Integer> res=new ArrayList<>();

    public List<Integer> topView(TreeNode root) {
        if (root == null) {
            return res;
        }
        Queue<Pair> q = new LinkedList<>();
        Map<Integer, Integer> map = new TreeMap<>();
        q.offer(new Pair(root, 0));
        while (!q.isEmpty()) {
            Pair polled = q.poll();
            int hd = polled.horizontalDistance;
            TreeNode cur = polled.node;
            if (!map.containsKey(hd)) {
                map.put(hd, cur.val);
            }
            if (cur.left != null) {
                q.offer(new Pair(cur.left, hd - 1));
            }
            if (cur.right != null) {
                q.offer(new Pair(cur.right, hd + 1));
            }

        }
        res.addAll(map.values());
        return res;
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.right.right = new TreeNode(6);

        TopViewBinaryTree tv = new TopViewBinaryTree();
        System.out.println(tv.topView(root));
    }
}
