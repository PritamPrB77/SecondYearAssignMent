package Graph;

import java.util.*;

//Using Array Of ArrAyList You Can Also Do It Like Oops Perticular Format
public class Graph1 {

    static class graph {
        int idx;
        int weight;
        int neigh;
       // graph next;
        graph(int idx,int weight,int neigh){
            this.neigh=neigh;
            //this.next=null;
            this.idx=idx;
            this.weight=weight;

        }
    }

    //graph using Matrix

    public static void Display(ArrayList<graph> arr[]) {

        for(int i=0;i<arr.length;i++) {
            System.out.print(i+"->");
            for(int j=0;j<arr[i].size();j++){
                System.out.print(arr[i].get(j).neigh+" ->");

            }
            System.out.println();
        }
    }

    public static void bfs(ArrayList<graph> arr[],int curr) {

        boolean[] vis=new boolean[arr.length];
        //vis[curr]=true;
        Queue<Integer> q=new LinkedList<>();
        q.add(curr);
        while(!q.isEmpty()) {
            int src=q.remove()	;
            if(!vis[src]) {

                System.out.print(src+" "+" ->");
                vis[src]=true;
                for(int i=0;i<arr[src].size();i++) {
                    graph edge=arr[src].get(i);
                    q.add(edge.neigh);
                }
            }
        }
    }


    public static void dfs(ArrayList<graph> arr[],int curr,boolean[]vis) {
        if(vis[curr]) {
            return;
        }

        vis[curr]=true;
        System.out.println(curr+" ");
        //+arr[curr].get(0).neigh+" "+arr[curr].get(0).weight

        for(int i=0;i<arr[curr].size();i++) {
            graph edge=arr[curr].get(i);
            dfs(arr,edge.neigh,vis);

        }
    }

    public static void CreateGraphList(ArrayList<graph>arr[]) {
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<arr.length;i++) {
            arr[i]=new ArrayList<>();
        }

//        arr[0].add(new graph(0,5,1));
//        arr[0].add(new graph(0,7,2));
//
//        arr[1].add(new graph(1,7,0));
//        arr[1].add(new graph(1,17,3));
//        arr[1].add(new graph(1,67,4));
//
//
//        arr[2].add(new graph(2,7,0));
//        arr[2].add(new graph(2,7,3));
//        arr[3].add(new graph(3,7,1));
//        arr[3].add(new graph(3,7,2));
//        arr[4].add(new graph(4,67,1));


        for (int i = 0; i <arr.length ; i++) {
            System.out.println("Want To Add Edges For "+i+" vertices index press true");
            while(sc.nextBoolean()){
                System.out.println("enter edge weight and neigh");
                arr[i].add(new graph(sc.nextInt(),sc.nextInt(),sc.nextInt()));
                System.out.println("Want To Add Edges For Vertices press true");
            }
        }

    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        Scanner sc=new Scanner(System.in);
//		System.out.println("enter the size");
//		int gphmatrix[][]=new int[sc.nextInt()][sc.nextInt()];
        ArrayList<graph>arr[]=new  ArrayList[5] ;
        CreateGraphList(arr);
        System.out.println();
        Display(arr);
        bfs(arr,0);
        boolean vis[]=new boolean[5];
        System.out.println();
        dfs(arr,0,vis);


    }

}

