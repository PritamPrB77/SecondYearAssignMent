package Graph;


import java.util.*;


class Edgecomparator implements  Comparator<primsAlgo.edge>{

    @Override
    public int compare(primsAlgo.edge o1, primsAlgo.edge o2) {
       return Integer.compare(o1.getcst(),o2.getcst());
    }
}



public class primsAlgo {
 private LinkedList<LinkedList<edge>>graph;
 int count;
     static class edge{
         @Override
         public String toString() {
             return "edge{" +
                     "src=" + src +
                     ", dst=" + dst +
                     ", cost=" + cost +
                     '}';
         }

         private int src,dst,cost;
         edge(int src,int dst,int cost){
             this.src=src;this.dst=dst;this.cost=cost;

         }

         public int  getcst(){
             return this.cost;
         }

    }
    primsAlgo(int cap){

        this.count=cap;
        graph=new LinkedList<LinkedList<edge>>();
        for (int i = 0; i <count; i++) {
            graph.add(new LinkedList<edge>());
        }

    }
    public void adddirectedGraph(int src,int dst,int cost){

        graph.get(src).add(new edge(src,dst,cost));
        //Adj.get(dst).add(new gph(dst,cost,src));

    }

    public  static  void prims(primsAlgo graph,int src){
        int previous[]=new int[graph.count];
        int dist[]=new int[graph.count];
        boolean[]vis=new boolean[graph.count];

        for (int i = 0; i < graph.count; i++) {
           previous[i]=-1;
           dist[i]=Integer.MAX_VALUE;
        }
        dist[src]=0;
        previous[src]=-1;
//        Edgecomparator comp=new Edgecomparator();
        PriorityQueue<edge> q=new PriorityQueue<>(100,((x,y)->{return  x.cost-y.cost;}));
         edge node=new edge(src,0,0);
         q.add(node);
        //q.add(edg);
        while(!q.isEmpty()){
               node=q.peek();
               q.remove();
               vis[src]=true;               src=node.dst;
               LinkedList<edge>adl=graph.graph.get(src);
               for(edge adn:adl){
                   int dest= adn.dst;
                   int alt=adn.cost;
                   if(dist[dest]>alt&&!vis[dest]){
                       dist[dest]=alt;
                       previous[dest]=src;
                       node=new edge(src,dest,alt);
                       q.add(node);
                   }
               }
        }



        for(boolean i:vis){
            System.out.println(i);
        }
        int count = graph.count;
        for (int i = 0; i < count; i++) {
            if (dist[i] == Integer.MAX_VALUE) {
                System.out.println(" node id " + i + "  prev " + previous[i] + " distance : Unreachable");
            } else {
                System.out.println(" node id " + i + "  prev " + previous[i] + " distance : " + dist[i]);

            }
        }




    }
     public  static  void Dijkstra (primsAlgo graph,int src){
        int previous[]=new int[graph.count];
        int dist[]=new int[graph.count];
        boolean[]vis=new boolean[graph.count];

        for (int i = 0; i < graph.count; i++) {
            previous[i]=-1;
            dist[i]=Integer.MAX_VALUE;
        }
        dist[src]=0;
        previous[src]=-1;
        Edgecomparator comp=new Edgecomparator();
        PriorityQueue<edge> q=new PriorityQueue<>(100,comp);
        edge node=new edge(src,0,0);
        q.add(node);
        //q.add(edg);
        while(!q.isEmpty()){
            node=q.peek();
            q.remove();
            vis[src]=true;
            src=node.dst;
            LinkedList<edge>adl=graph.graph.get(src);
            for(edge adn:adl){
                int dest= adn.dst;
                int alt=adn.cost+dist[src];
                if(dist[dest]>alt&&!vis[dest]){
                    dist[dest]=alt;
                    previous[dest]=src;
                    node=new edge(src,dest,alt);
                    q.add(node);
                }
            }


        }



        for(boolean i:vis){
            System.out.println(i);
        }
        int count = graph.count;
        for (int i = 0; i < count; i++) {
            if (dist[i] == Integer.MAX_VALUE) {
                System.out.println(" node id " + i + "  prev " + previous[i] + " distance : Unreachable");
            } else {
                System.out.println(" node id " + i + "  prev " + previous[i] + " distance : " + dist[i]);

            }
        }




    }
    public  void Display(){
        System.out.println(count);
        for (int i=0;i<count;i++){
            // System.out.println("hello");

            LinkedList<edge>Ad= graph.get(i);
            System.out.print(i+"->");
            for (edge s:Ad){
                System.out.print(s.dst+" ");
            }
            System.out.println();
            // System.out.println(i);

        }
    }

    public static void main(String[] args) {
        primsAlgo s1=new primsAlgo(5);
        s1.adddirectedGraph(0,1,4);
        s1.adddirectedGraph(0,2,6);
        s1.adddirectedGraph(1,3,2);
        s1.adddirectedGraph(1,2,1);
        s1.adddirectedGraph(2,1,4);

        s1.adddirectedGraph(2,3,41);
        s1.adddirectedGraph(3,4,1);

       s1.Display();

        System.out.println(s1.graph.get(0).get(1).dst);
       prims(s1,0);


        PriorityQueue<edge> q=new PriorityQueue<>(new Edgecomparator());
//        q.add(new edge(0,1,4));
        q.add(new edge(0,1,3));
        q.add(new edge(0,1,2));

        System.out.println(q);


        Dijkstra(s1,0);
    }


}
