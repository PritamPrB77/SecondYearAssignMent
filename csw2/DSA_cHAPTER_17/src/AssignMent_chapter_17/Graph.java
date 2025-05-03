package AssignMent_chapter_17;


import java.util.*; 
public class Graph { 
    private int vertices; private int[][] adjMatrix; 
    private List<List<Integer>> adjList; 
    public Graph(int vertices) { 
        this.vertices = vertices; 
        adjMatrix = new int[vertices][vertices]; 
        adjList = new ArrayList<>(); 
        for (int i = 0; i < vertices; i++) { 
            adjList.add(new ArrayList<>()); 
        } 
    } 
    public void addEdge(int u, int v) { 
        adjMatrix[u][v] = 1; adjMatrix[v][u] = 1; 
        adjList.get(u).add(v); adjList.get(v).add(u); 
    } 
    public void displayAdjMatrix() { 
        System.out.println("Adjacency Matrix:"); 
        for (int i = 0; i < vertices; i++) { 
            for (int j = 0; j < vertices; j++) { 
                System.out.print(adjMatrix[i][j] + " "); 
            } 
            System.out.println(); 
        } 
    } 
    public void displayAdjList() { 
        System.out.println("Adjacency List:"); 
        for (int i = 0; i < vertices; i++) { 
            System.out.print(i + ": "); 
            for (int j = 0; j < adjList.get(i).size(); j++) { 
                System.out.print(adjList.get(i).get(j) + " "); 
            } 
            System.out.println(); 
        } 
    } 
    public static void main(String[] args) { 
        Graph g = new Graph(5); 
        g.addEdge(0, 1); g.addEdge(0, 4); g.addEdge(1, 2); 
        g.addEdge(1, 3); g.addEdge(1, 4); g.addEdge(3, 4); 
        g.displayAdjMatrix(); g.displayAdjList(); 
    } 
} 
 
