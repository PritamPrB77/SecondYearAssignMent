package AssignMent_chapter_17;


import java.util.*; 
public class ArrayDequee { 
    private int vertices; 
    private LinkedList<Integer>[] adjList; 
    public ArrayDequee(int vertices) { 
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
    public void displayAdjList() { 
        System.out.println("Adjacency List Representation:"); 
        for (int i = 0; i < adjList.length; i++) { 
            System.out.print(i + " -> "); 
            for (int neighbor : adjList[i]) { 
                System.out.print(neighbor + " "); 
            } 
            System.out.println(); 
        } 
    } 
    public void bfs(int startVertex) { 
        boolean[] visited = new boolean[vertices]; 
        ArrayDeque<Integer> queue = new ArrayDeque<>(); 
        visited[startVertex] = true; 
        queue.add(startVertex); 
        System.out.println("\nBreadth-First Search starting from vertex " + 
startVertex + ":"); 
        while (!queue.isEmpty()) { 
            int currentVertex = queue.poll(); 
            System.out.print(currentVertex + " "); 
            for (int neighbor : adjList[currentVertex]) { 
                if (!visited[neighbor]) { 
                    visited[neighbor] = true; 
                    queue.add(neighbor); 
                } 
            } 
        } 
        System.out.println(); 
    } 
    public static void main(String[] args) { 
        int vertices = 5; 
        ArrayDequee  g = new ArrayDequee(vertices); 
        g.addEdge(0, 1); 
        g.addEdge(0, 2); 
        g.addEdge(1, 3); 
        g.addEdge(3, 4); 
        g.addEdge(4, 2); 
        g.displayAdjList(); g.bfs(0); 
    } 
}