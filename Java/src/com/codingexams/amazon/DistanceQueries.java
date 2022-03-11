package com.codingexams.amazon;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class DistanceQueries {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter wr = new PrintWriter(System.out);
        int T = 1;
        for (int t_i = 0; t_i < T; t_i++) {
            int N = 3;
            int[][] edges = new int[N - 1][2];
            for (int i_edges = 0; i_edges < N - 1; i_edges++) {
                String[] arr_edges = br.readLine().split(" ");
                for (int j_edges = 0; j_edges < arr_edges.length; j_edges++) {
                    edges[i_edges][j_edges] = Integer.parseInt(arr_edges[j_edges]);
                }
            }
            int Q = 1;
            String[] arr_queries = br.readLine().split(" ");
            int[] queries = new int[Q];
            for (int i_queries = 0; i_queries < arr_queries.length; i_queries++) {
                queries[i_queries] = Integer.parseInt(arr_queries[i_queries]);
            }

            String[] out_ = dist_queries(N, edges, Q, queries);
            System.out.print(out_[0]);
            for (int i_out_ = 1; i_out_ < out_.length; i_out_++) {
                System.out.print(" " + out_[i_out_]);
            }

            System.out.println();

        }

        wr.close();
        br.close();
    }

    static void dfs(int node, int[][] edges, int dp[], boolean visited[]) {
        // Mark as visited
        visited[node] = true;


        for (int i = 0; i < node - 1; i++) {
            for (int j = 0; j < 2; j++) {
                if (!visited[edges[i][j]]) {
                    dfs(edges[i][j], edges, dp, visited);
                }
                dp[node] = Math.max(dp[node], 1 + dp[edges[i][j]]);
            }
        }
    }

    static String[] dist_queries(int N, int[][] edges, int Q, int[] queries) {
        // Write your code here

        String[] result = {""};

        // Dp array
        int[] dp = new int[N + 1];

        boolean[] visited = new boolean[N + 1];

        // Call DFS for every unvisited vertex
        for (int i = 1; i <= N; i++) {
            if (!visited[i])
                dfs(i, edges, dp, visited);
        }

        int ans = 0;

        // Traverse and find the maximum of all dp[i]
        for (int i = 1; i <= N; i++) {
            ans = Math.max(ans, dp[i]);
        }
        for (int i : queries) {
            if (i >= ans) {
                System.out.println("YES");
            } else {
                System.out.println("NO");

            }
        }
        return null;
    }

}