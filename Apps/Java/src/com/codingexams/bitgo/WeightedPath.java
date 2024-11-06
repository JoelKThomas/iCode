package com.codingexams.bitgo;

import java.util.*;

public class WeightedPath {

    public static String weightedPath(String[] strArr) {
        try {
            int n = Integer.parseInt(strArr[0]);  // Number of nodes
            String start = strArr[1];  // Start node
            String end = strArr[n];  // End node

            // Create the graph using adjacency list with weights
            Map<String, List<Edge>> graph = new HashMap<>();
            for (int i = 1; i <= n; i++) {
                graph.put(strArr[i], new ArrayList<>());
            }

            // Parse the connections with weights
            for (int i = n + 1; i < strArr.length; i++) {
                // Split by '|'
                String[] parts = strArr[i].split("\\|");
                if (parts.length != 3) {
                    System.out.println("Invalid edge format: " + strArr[i]);
                    continue;  // Skip invalid input
                }

                String from = parts[0];
                String to = parts[1];
                int weight = Integer.parseInt(parts[2]);

                // Add bidirectional edges with weights
                graph.get(from).add(new Edge(to, weight));
                graph.get(to).add(new Edge(from, weight));
            }

            // Use Dijkstra's algorithm to find the shortest weighted path
            PriorityQueue<Path> queue = new PriorityQueue<>(Comparator.comparingInt(p -> p.weight));
            Set<String> visited = new HashSet<>();

            queue.offer(new Path(start, 0, Arrays.asList(start)));

            while (!queue.isEmpty()) {
                Path currentPath = queue.poll();
                String currentNode = currentPath.node;

                if (currentNode.equals(end)) {
                    return String.join("-", currentPath.path);
                }

                if (!visited.add(currentNode)) {
                    continue;
                }

                for (Edge edge : graph.getOrDefault(currentNode, new ArrayList<>())) {
                    if (!visited.contains(edge.to)) {
                        List<String> newPath = new ArrayList<>(currentPath.path);
                        newPath.add(edge.to);
                        queue.offer(new Path(edge.to, currentPath.weight + edge.weight, newPath));
                    }
                }
            }

            return "-1";  // No path found

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
            return "-1";
        }
    }

    static class Edge {
        String to;
        int weight;

        Edge(String to, int weight) {
            this.to = to;
            this.weight = weight;
        }
    }

    static class Path {
        String node;
        int weight;
        List<String> path;

        Path(String node, int weight, List<String> path) {
            this.node = node;
            this.weight = weight;
            this.path = path;
        }
    }

    public static void main(String[] args) {
        // Example usage
        String[] strArr = {"4", "A", "B", "C", "D", "A|B|2", "B|C|11", "C|D|3", "B|D|2"};
        System.out.println(weightedPath(strArr));  // Output: A-B-D
    }
}
