package AssignMent_chapter_17;

import java.util.*; 
public class GraphDFS { 
    private int vertices; 
    private LinkedList<Integer>[] adjList; 
    public GraphDFS(int vertices) { 
        this.vertices = vertices; 
        adjList = new LinkedList[vertices]; 
        for (int i = 0; i < vertices; i++) { 
            adjList[i] = new LinkedList<>(); 
        } 
    } 
    public void addEdge(int source, int destination) { 
        adjList[source].add(destination); 
        adjList[destination].add(source); 
    } 
    public void dfs(int startVertex) { 
        boolean[] visited = new boolean[vertices]; 
        System.out.println("\nDepth-First Search starting from vertex " + 
startVertex + ":"); 
        dfsUtil(startVertex, visited); 
    } 
    private void dfsUtil(int vertex, boolean[] visited) { 
        visited[vertex] = true; 
        System.out.print(vertex + " "); 
        for (int neighbor : adjList[vertex]) { 
            if (!visited[neighbor]) { 
                dfsUtil(neighbor, visited); 
            } 
        } 
    } 
    public void displayGraph() { 
        System.out.println("Adjacency List Representation:"); 
        for (int i = 0; i < vertices; i++) { 
            System.out.print(i + " -> "); 
            for (int neighbor : adjList[i]) { 
                System.out.print(neighbor + " "); 
            } 
            System.out.println(); 
        } 
    } 
    public static void main(String[] args) { 
        int vertices = 5; 
        GraphDFS g = new GraphDFS(vertices); 
        g.addEdge(0, 1); 
        g.addEdge(0, 2); 
        g.addEdge(1, 3); 
        g.addEdge(3, 4); 
        g.addEdge(4, 2); 
        g.displayGraph(); 
        g.dfs(0); 
    } 
} 
