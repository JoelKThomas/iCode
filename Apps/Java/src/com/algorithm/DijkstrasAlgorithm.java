package com.algorithm;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class DijkstrasAlgorithm {

    /**
     * Runs Dijkstra's algorithm to find the shortest paths from the start vertex.
     *
     * @param start The starting vertex.
     * @param graph An adjacency list representation of the graph.
     * @return An array of shortest distances from the start vertex to each other vertex.
     *         If a vertex is unreachable, the distance is marked as -1.
     */
    public static int[] dijkstrasAlgorithm(int start, int[][][] graph) {
        int numVertices = graph.length;
        int[] minDistances = new int[numVertices];
        Arrays.fill(minDistances, Integer.MAX_VALUE);  // Initialize with infinity.
        minDistances[start] = 0;  // Distance to the start vertex is 0.

        Set<Integer> visited = new HashSet<>();

        while (visited.size() != numVertices) {
            int[] vertexData = getNextVertex(minDistances, visited);
            int currentVertex = vertexData[0];
            int currentDistance = vertexData[1];

            if (currentDistance == Integer.MAX_VALUE)
                break; // Unreachable vertex found.

            visited.add(currentVertex);  // Mark this vertex as visited.

            // Explore all neighbors of the current vertex.
            for (int[] edge : graph[currentVertex]) {
                int neighbor = edge[0];
                int edgeWeight = edge[1];

                if (visited.contains(neighbor)) continue;  // Skip visited vertices.

                int newDistance = currentDistance + edgeWeight;
                if (newDistance < minDistances[neighbor]) {
                    minDistances[neighbor] = newDistance;  // Update to the shorter path.
                }
            }
        }

        // Replace unreachable distances with -1.
        return Arrays.stream(minDistances)
                .map(distance -> distance == Integer.MAX_VALUE ? -1 : distance)
                .toArray();
    }

    /**
     * Finds the next unvisited vertex with the smallest known distance.
     *
     * @param distances The array of current shortest distances.
     * @param visited   The set of already visited vertices.
     * @return An array containing the next vertex and its minimum distance.
     */
    private static int[] getNextVertex(int[] distances, Set<Integer> visited) {
        int minDistance = Integer.MAX_VALUE;
        int vertex = -1;

        for (int i = 0; i < distances.length; i++) {
            if (!visited.contains(i) && distances[i] <= minDistance) {
                minDistance = distances[i];
                vertex = i;
            }
        }
        return new int[]{vertex, minDistance};
    }

    public static void main(String[] args) {
        int startVertex = 0;
        int[][][] graph = {
                {{1, 7}},
                {{2, 6}, {3, 20}, {4, 3}},
                {{3, 14}},
                {{4, 2}},
                {},
                {}
        };

        int[] shortestPaths = dijkstrasAlgorithm(startVertex, graph);
        System.out.println("Shortest paths from vertex " + startVertex + ": " + Arrays.toString(shortestPaths));
    }
}
