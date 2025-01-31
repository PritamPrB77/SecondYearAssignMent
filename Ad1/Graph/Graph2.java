package Graph;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Graph2 {

//    static class grph{
//        int src; int dst; int wt;
//        grph(){
//
//        }
//        grph(int src,int dst,int wt){
//            this.src=src; this.dst=dst;this.wt=wt;
//        }
//    }
    //Undirected Gaph
    public static void Adding (int graph[][],int src,int dst,int wt){
        graph[src][dst]=1;
        graph[dst][src]=1;
    }

//    public static void createGraphMatrix(int arr[][]) {
//        Scanner sc=new Scanner(System.in);
//        System.out.println(" you want to store weight or not");
//        if(sc.nextBoolean()) {
//            System.out.println("Enter weight  else -1 ");
//            for(int i=0;i<arr.length;i++) {
//                for(int j=0;j<arr[i].length;j++) {
//                    arr[i][j]=sc.nextInt();
//                }
//            }
//
//        }
//        else {
//            System.out.println("Enter -1 else 1 ");
//
//            for(int i=0;i<arr.length;i++) {
//                for(int j=0;j<arr[i].length;j++) {
//                    arr[i][j]=sc.nextInt();
//                }
//            }
//        }
//
//    }


     public static void Display(int graph[][]){
         for (int i = 0; i <graph.length ; i++) {
             System.out.print("Neighbour oF "+i+" is");
             for (int j = 0; j < graph[i].length; j++) {
                 if(graph[i][j]>0){
                     System.out.print(j);
                 }
             }
             System.out.println();
         }
     }
    public static void CreateGraph( int graph[][]){
        for (int i = 0; i <graph.length ; i++) {
            Arrays.fill(graph[i],-1);

        }
        Scanner sc=new Scanner(System.in);

//        for (int i = 0; i <graph.length ; i++) {
//            System.out.println("Want To Add Edges For " + i + " vertices index press true");
//            while (sc.nextBoolean()) {
//                System.out.println("enter edge weight and neigh");
//                Adding(graph, sc.nextInt(), sc.nextInt(), sc.nextInt());
//                System.out.println("Want To Add Edges For Vertices press true");
//            }
//        }
//4 cross 4 graph
        Adding(graph, 0,1,56);
        Adding(graph, 0,2,56);

        Adding(graph, 1,3,56); Adding(graph, 2,3,56);
       // Adding(graph, 1,2,56);


        for (int i[]:graph){
            for (int j:i){
                System.out.print(j+" ");
            }
            System.out.println();
        }
        Display(graph);
    }

    public static  void bfs(int [][]graph,int src){
        boolean vis[]=new boolean[graph.length];
        Queue<Integer>s1=new LinkedList<>();
        s1.add(src);
        vis[src]=true;
        while(!s1.isEmpty()){
            int elem=s1.remove();
            System.out.print(elem+" ");
            for (int i = 0; i < graph.length; i++) {
                if (graph[elem][i]==1 &&!vis[i]){
                    s1.add(i);
                    vis[i]=true;
                }

            }
        }
    }

public static  void dfs(int [][]graph,boolean[]vis,int src){
        if(vis[src]) return;
    System.out.print(src+"->");
        vis[src]=true;
    for (int i = 0; i < graph[src].length; i++) {
         if(graph[src][i]==1&&!vis[i]){
             dfs(graph,vis,i);
         }
    }

}



    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter vertices");
       // Graph2 [][] s1=new Graph2[sc.nextInt()][sc.nextInt()];
        int graph[][]=new int[4][4];
        CreateGraph(graph);
        bfs(graph,0);
        System.out.println();
        boolean []vis=new boolean[graph.length];
        Arrays.fill(vis,false);
          dfs(graph,vis,0);
    }

}
