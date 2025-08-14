package Graph;

import java.util.*;

class Edge implements Comparable<Edge> {
    int src, dest, weight;

    public Edge(int src, int dest, int weight) {
        this.src = src;
        this.dest = dest;
        this.weight = weight;
    }

    @Override
    public int compareTo(Edge other) {
        return this.weight - other.weight; // Sort edges by weight
    }
}

class DSU {
    private int[] parent, rank;

    public DSU(int n) {
        parent = new int[n];
        rank = new int[n];
        for (int i = 0; i < n; i++) {
            parent[i] = i; // Each node is its own parent
            rank[i] = 1;   // Rank initialized to 1
        }
    }

    public int find(int i) {
        if (parent[i] != i) {
            parent[i] = find(parent[i]); // Path compression
        }
        return parent[i];
    }

    public void union(int x, int y) {
        int rootX = find(x);
        int rootY = find(y);

        if (rootX != rootY) {
            if (rank[rootX] > rank[rootY]) {
                parent[rootY] = rootX;
            } else if (rank[rootX] < rank[rootY]) {
                parent[rootX] = rootY;
            } else {
                parent[rootY] = rootX;
                rank[rootX]++;
            }
        }
    }
}

class KruskalAlgorithm {
    public static List<Edge> kruskalMST(int n, List<Edge>[] graph) {
        List<Edge> edges = new ArrayList<>();

        // Convert adjacency list to edge list
        for (int i = 0; i < n; i++) {
            edges.addAll(graph[i]);
        }

        // Sort edges by weight
        Collections.sort(edges);

        DSU dsu = new DSU(n);
        List<Edge> mst = new ArrayList<>();
        int mstWeight = 0;

        for (Edge edge : edges) {
            if (dsu.find(edge.src) != dsu.find(edge.dest)) { // If no cycle
                dsu.union(edge.src, edge.dest);
                mst.add(edge);
                mstWeight += edge.weight;
            }
        }

        System.out.println("Minimum Spanning Tree Weight: " + mstWeight);
        return mst;
    }

    public static void main(String[] args) {
        int n = 5; // Number of nodes
        List<Edge>[] graph = new ArrayList[n];

        for (int i = 0; i < n; i++) {
            graph[i] = new ArrayList<>();
        }

        // Add edges to adjacency list
        graph[0].add(new Edge(0, 1, 10));
        graph[0].add(new Edge(0, 2, 6));
        graph[0].add(new Edge(0, 3, 5));
        graph[1].add(new Edge(1, 3, 15));
        graph[2].add(new Edge(2, 3, 4));

        List<Edge> mst = kruskalMST(n, graph);

        System.out.println("Edges in Minimum Spanning Tree:");
        for (Edge edge : mst) {
            System.out.println(edge.src + " - " + edge.dest + " : " + edge.weight);
        }
    }
}
