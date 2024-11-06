package com.codingexams.bitgo;

import java.util.*;

public class ShortestPath {

    public static String shortestPath(String[] strArr) {
        int n = Integer.parseInt(strArr[0]);  // Number of nodes
        String start = strArr[1];  // Start node
        String end = strArr[n];  // End node

        // Create the graph as an adjacency list
        Map<String, List<String>> graph = new HashMap<>();
        for (int i = 1; i <= n; i++) {
            graph.put(strArr[i], new ArrayList<>());
        }

        // Parse the connections and build the graph
        for (int i = n + 1; i < strArr.length; i++) {
            String[] connection = strArr[i].split("-");
            String nodeA = connection[0];
            String nodeB = connection[1];

            // Add bidirectional edges
            graph.get(nodeA).add(nodeB);
            graph.get(nodeB).add(nodeA);
        }

        // Use BFS to find the shortest path from start to end
        Queue<List<String>> queue = new LinkedList<>();
        Set<String> visited = new HashSet<>();
        queue.offer(Arrays.asList(start));
        visited.add(start);

        while (!queue.isEmpty()) {
            List<String> path = queue.poll();
            String lastNode = path.get(path.size() - 1);

            // If we reach the end node, return the path
            if (lastNode.equals(end)) {
                return String.join("-", path);
            }

            // Explore neighbors
            for (String neighbor : graph.getOrDefault(lastNode, new ArrayList<>())) {
                if (!visited.contains(neighbor)) {
                    visited.add(neighbor);
                    List<String> newPath = new ArrayList<>(path);
                    newPath.add(neighbor);
                    queue.offer(newPath);
                }
            }
        }

        // If no path is found, return -1
        return "-1";
    }

    public static void main(String[] args) {
        // Example usage
        String[] strArr = {"5", "A", "B", "C", "D", "F", "A-B", "A-C", "B-C", "C-D", "D-F"};
        System.out.println(shortestPath(strArr));  // Output: A-C-D-F
    }
}

