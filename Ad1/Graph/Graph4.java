package Graph;

import java.util.ArrayList;
import java.util.LinkedList;

public class Graph4 {


    static  class Edge {
        int src; int dst; int wt;
        Edge(int src,int dst,int wt){
            this.dst=dst; this.wt=wt;
            this.src=src;

        }
    }

    //Same As taking Normal input
//     public static void connectEdge(LinkedList<LinkedList<Edge>>Adj,int i,int j){
//        Adj
//     }
    public static void CreateGraph(LinkedList<LinkedList<Edge>> Graph,int cnt){
        for (int i = 0; i < cnt; i++) {
            Graph.add(new LinkedList<Edge>());
        }

        // We CAn DO it USer INPUT BUt IT WILL TIme TAking So-
//        for (int i = 0; i < cnt; i++) {
//            Graph.get(i).add(new Edge(0,1,34));
//
//        }
        Graph.get(0).add(new Edge(0,1,45));
        Graph.get(0).add(new Edge(0,2,45));

      //  Graph.get(1).add(new Edge(1,2,45));
        Graph.get(1).add(new Edge(1,3,45));
        Graph.get(1).add(new Edge(1,0,45));

     //   Graph.get(2).add(new Edge(2,1,45));
        Graph.get(2).add(new Edge(2,3,45));
        Graph.get(2).add(new Edge(2,0,45));
        Graph.get(3).add(new Edge(3,2,45));
        Graph.get(3).add(new Edge(3,1,45));
        
    }
    
    
    public static  void Display(LinkedList<LinkedList<Edge>>Adj){
        for (int i = 0; i < Adj.size(); i++) {
            LinkedList<Edge> as=Adj.get(i);
            System.out.print(i+"->");
            for (Edge s:as){
                System.out.print(s.dst+" ");
            }
            System.out.println();
            
        }
        
    }


    public static  void dfs(LinkedList<LinkedList<Edge>>graph,boolean vis[],int src){
        if(vis[src]) return;
        vis[src]=true;
        System.out.print(src+"-> ");
        //LinkedList<Edge> s1=graph.get(src);
        for (int i = 0; i < graph.get(src).size();i++) {
            Edge v=graph.get(src).get(i);
            dfs(graph, vis,v.dst);

        }

    }

    public static void main(String[] args) {
        LinkedList<LinkedList<Edge>> Adj=new LinkedList<LinkedList<Edge>>();
        CreateGraph(Adj,4);
                Display(Adj);
                boolean vis[]=new boolean[4];
                dfs(Adj,vis,0);
    }
}
