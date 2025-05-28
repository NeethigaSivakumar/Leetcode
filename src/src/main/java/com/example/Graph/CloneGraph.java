package com.example.Graph;


import java.util.HashMap;
import java.util.Map;

class CloneGraph {
    private static Map<Node,Node> visitedMap=new HashMap<>();
    public static Node cloneGraph(Node node) {
        if(node==null){
            return null;
        }
        if(visitedMap.containsKey(node)){
            return visitedMap.get(node);
        }
        Node clone=new Node(node.val);
        visitedMap.put(node,clone);
        for(Node n:node.neighbors){
            clone.neighbors.add(cloneGraph(n));
        }
        return clone;
    }

    public static void main(String[] args) {
        Node node1 = new Node(1);
        Node node2 = new Node(2);
        Node node3 = new Node(3);
        Node node4 = new Node(4);

        node1.neighbors.add(node2);
        node1.neighbors.add(node4);

        node2.neighbors.add(node1);
        node2.neighbors.add(node3);

        node3.neighbors.add(node2);
        node3.neighbors.add(node4);

        node4.neighbors.add(node1);
        node4.neighbors.add(node3);

        CloneGraph cloner = new CloneGraph();
        Node clonedNode = cloner.cloneGraph(node1);
    }
}
