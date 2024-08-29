package com.competitive.graph;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DepthFirstSearch {

    static class Node {
        private String name;
        List<Node> children = new ArrayList<>();

        public Node(String name){
            this.name = name;
        }

        List<String> depthFirstSearch(List<String> array){
            array.add(this.name);
            for(int i=0; i < children.size(); i++){
                children.get(i).depthFirstSearch(array);
            }
            return array;
        }

        public Node addChild(String name){
            Node node = new Node(name);
            children.add(node);
            return this;
        }
    }

    public static void main(String[] args) {
        Node graph = new Node("A");
        graph.addChild("B").addChild("C").addChild("D");
        graph.children.get(0).addChild("E").addChild("F");
        graph.children.get(2).addChild("G").addChild("H");
        graph.children.get(0).children.get(1).addChild("I").addChild("J");
        graph.children.get(2).children.get(0).addChild("K");


        List<String> result = graph.depthFirstSearch(new ArrayList<>());
        System.out.println(result);
    }
}
