package Graph;

import java.util.*;

///multiList Or LIst of List
public class Graph3 {
     private LinkedList<LinkedList<gph>> Adj;
   int c0nt;

   //if i use default size than i could modify itt like hashed map
     Graph3(int cnt){
       c0nt=cnt;
             Adj=new LinkedList<LinkedList<gph>>();
         for (int i = 0; i < cnt; i++) {
             Adj.add(new LinkedList<gph>());
         }

}
    static class gph {
        int idx;
        int weight;
        int neigh;
        // graph next;
        gph(int idx,int weight,int neigh){
            this.neigh=neigh;
            //this.next=null;
            this.idx=idx;
            this.weight=weight;

        }
    }
    public void addUndirectedGraph(int src,int dst,int cost){

         Adj.get(src).add(new gph(src,cost,dst));
        //Adj.get(dst).add(new gph(dst,cost,src));

    }

    public  void Display(){
        System.out.println(c0nt);
         for (int i=0;i<c0nt;i++){
            // System.out.println("hello");

             LinkedList<gph>Ad=Adj.get(i);
             System.out.print(i+"->");
             for (gph s:Ad){
                 System.out.print(s.neigh+" ");
             }
             System.out.println();
            // System.out.println(i);

         }
    }
   public static  void  DFSUTil(Graph3 grph, int src,boolean[]vis, Stack<Integer> stk){
         vis[src]=true;
         LinkedList<gph> Ad= grph.Adj.get(src);
         for(gph edg:Ad){
             if(!vis[edg.neigh]){
                 DFSUTil(grph,edg.neigh,vis,stk);
             }
         }
         stk.push(src);


   }

   public static  void Dfs(Graph3 graph,boolean vis[],int src){
         vis[src]=true;
         LinkedList<gph> Ad=graph.Adj.get(src);
         for(gph ad:Ad){
             if(!vis[ad.neigh]){
                 Dfs(graph,vis,ad.neigh);
             }

         }
   }
   public static  boolean pathexitOrnot(Graph3 graph,int src,int dst){
         int count=graph.c0nt;
         boolean vis[]=new boolean[count];
         Dfs(graph,vis,src);
         return vis[dst];
   }
// it has some mistake i reviewing it it only work if input is dag else it give wrong output
    public static  void ToplologicalSort(Graph3 gph){
         Stack<Integer>stk=new Stack<Integer>();
         int count=gph.c0nt;
         boolean vis[]=new boolean[count];
        Arrays.fill(vis,false);
        for (int i = 0; i < count; i++) {
          if(!vis[i]){
              DFSUTil(gph,i,vis,stk);
          }
        }

        System.out.println("Topological Sort");

        while(!stk.isEmpty()){
            System.out.print(stk.pop()+"->");
        }
    }

    public static  int DfscountPath(Graph3 graph,int src, int dst,boolean vis[]){
         if(src==dst){
             return  1;
         }
         int count=0;
         vis[src]=true;
         LinkedList<gph> ad=graph.Adj.get(src);
         for(gph edg:ad){
             if(!vis[edg.neigh]){
                count+= DfscountPath(graph, edg.neigh, dst,vis);
             }
             vis[src]=false;
         }
         return  count;
    }

    public static int CountAllPath(Graph3 graph,int src,int dst){
         boolean vis[]= new boolean[graph.c0nt];
         return DfscountPath(graph,src,dst,vis);
    }
    public  static  void Dfsutiliprintpath(Graph3 graph,boolean vis[],Stack<Integer>pth,int src,int dst){
         pth.push(src);
         if(src==dst){
             System.out.println(pth);
            pth.pop(); return;
         }
         vis[src]=true;
         LinkedList<gph> ad=graph.Adj.get(src);
         for(gph edge:ad){
             if(!vis[edge.neigh]){
                 Dfsutiliprintpath(graph, vis, pth, edge.neigh, dst);
             }
         }
         vis[src]=false;
         pth.pop();


    }

    public static  void PrintAllPath(Graph3 graph,int src,int dst){
         boolean vis[]=new boolean[graph.c0nt];
         Stack<Integer> stk=new Stack<>();
         Dfsutiliprintpath(graph,vis,stk,src,dst);
    }
    public static  int bfsDistance(Graph3 s1,int src,int dst){
                                        boolean vis[]=new boolean[s1.c0nt];
                                        Queue<Integer>q=new LinkedList<>();
                                        int cntDist[]=new int[s1.c0nt];
                                        Arrays.fill(cntDist,0);
                                        q.add(src);
                                        cntDist[src]=0;
                                        vis[src]=true;
                                        while (!q.isEmpty()){
                                            int elem=q.remove();
                                            int depth=cntDist[elem];

                                            LinkedList <gph> Ad=s1.Adj.get(elem);
                                            for(gph edge:Ad){
                                                if(edge.neigh==dst){
                                                    // cntDist[edge.neigh]=depth+1;
                                                    // return cntDist[edge.neigh];
                                                    return depth+1;
                                                }


                                                if(!vis[edge.neigh]){
                                                    q.add(edge.neigh);
                                                    cntDist[edge.neigh]=depth+1;
                                                    vis[edge.neigh]=true;
                                                }

                                            }

                                        }

                                      return  -1;
                           }

    public static boolean  isCyclepresent  (Graph3 graph, boolean[]vis,int curr, int  parent) {

         vis[curr]=true;
         LinkedList<gph> Adj= graph.Adj.get(curr);
         for(gph adj: Adj){
             if(!vis[adj.neigh]){
               if(  isCyclepresent(graph,vis,adj.neigh,curr)){
                   return true;
               }

             }
             else if(vis[adj.neigh]&&adj.neigh!=parent){
                 return true;
             }
         }
         return false;
               }

      public static boolean disconnectNumofCycle(Graph3 graph ){
             boolean vis[]=new boolean[graph.c0nt];

         for(int i=0;i<graph.c0nt;i++){
                if(vis[i]==false){
                    if(isCyclepresent(graph,vis,i,-1)){
                        return true;
                    }
                }
         }
       return false;
        }

      public static String checkUndirectedConnected(Graph3 graph,int src){
         boolean vis[]=new boolean[graph.c0nt];
            Dfs(graph, vis,src);
            for(int i=0;i< graph.c0nt;i++){
                if(vis[i]==false){
                    return "Disconnected";
                }
            }
            return "connected";
      }

public static  void checkshortestpathUndirected(Graph3 s1,int src){

         int distannce[]=new int[s1.c0nt];
         int path[]=new int[s1.c0nt];
         Arrays.fill(distannce,-1);
         Queue<Integer> q=new LinkedList<>();
         q.add(src);
         distannce[src]=0;

         while (!q.isEmpty()){
             int elem=q.remove();
             LinkedList<gph> adj=s1.Adj.get(elem);
             for(gph edge: adj){
                 if(distannce[edge.neigh]==-1){
                     distannce[edge.neigh]=distannce[elem]+1;
                     path[edge.neigh]=elem;
                     q.add(edge.neigh);
                 }
             }
         }

    for (int i = 0; i < s1.c0nt; i++) {
        System.out.println(path[i] + " to " + i + " weight " +distannce[i]);
    }

}


    public static void main(String[] args) {

         Graph3 s1=new Graph3(5);
//         s1.addUndirectedGraph(1,0,34);
//         s1.addUndirectedGraph(1,2,56);
//        s1.addUndirectedGraph(2,3,56);
//        s1.addUndirectedGraph(1,3,56);
//        s1.addUndirectedGraph(3,0,56);
       // s1.addUndirectedGraph(2,3,56);


        s1.addUndirectedGraph(0,1,34);
        s1.addUndirectedGraph(0,2,34);
        s1.addUndirectedGraph(1,3,34);
        s1.addUndirectedGraph(1,2,34);
        s1.addUndirectedGraph(2,1,34);

        s1.addUndirectedGraph(2,3,34);
        s1.addUndirectedGraph(3,4,34);


//        s1.addUndirectedGraph(5,6,45);
//        s1.addUndirectedGraph(5,7,45);
//        s1.addUndirectedGraph(6,7,45);

         s1.Display();
//         s1.ToplologicalSort(s1);
//        System.out.println("Path exit or not "+s1.pathexitOrnot(s1,1,3));
//        System.out.println("All thE Paths From src to dst"+s1.CountAllPath(s1,1,3));
//        System.out.println("Print All The Path from src to dst");
//        PrintAllPath(s1,0,3);
//        System.out.println("Distance Between src to dst is"+s1.bfsDistance(s1,0,4));

//        boolean vis[]=new boolean[s1.c0nt];
//        //in conntected graph
//        System.out.println("is cyclee present "+s1.isCyclepresent(s1,vis,0,-1));
//         //in disconnected graoph
//        System.out.println("is cyclee present "+s1.disconnectNumofCycle(s1));


        //System.out.println("say graph is connected or not  ? "+ s1.checkUndirectedConnected(s1,0));

        checkshortestpathUndirected(s1,1);




//
//        EdgeComparator comp = new EdgeComparator();
//        PriorityQueue<gph>=new PriorityQueue<gph>(100,comp);

    }

}



