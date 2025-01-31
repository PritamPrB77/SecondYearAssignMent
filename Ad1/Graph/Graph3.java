package Graph;

import java.util.*;

///multiList Or LIst of List
public class Graph3 {
     private LinkedList<LinkedList<gph>> Adj;
   int c0nt;
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

         s1.Display();
         s1.ToplologicalSort(s1);
        System.out.println("Path exit or not "+s1.pathexitOrnot(s1,1,3));
        System.out.println("All thE Paths From src to dst"+s1.CountAllPath(s1,1,3));
        System.out.println("Print All The Path from src to dst");
        PrintAllPath(s1,0,3);
        System.out.println("Distance Between src to dst is"+s1.bfsDistance(s1,0,4));

    }

}
