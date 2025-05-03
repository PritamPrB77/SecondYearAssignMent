package week9day3;

import java.util.Arrays;
import java.util.LinkedList;



public class GraphAdjList {
	LinkedList<Integer> []adj;
	public void initializeList(int v) {
		adj=new LinkedList[v];
		for(int i=0; i<v; i++)
			adj[i]=new LinkedList<Integer>();
	}
	public void addEdge(int i,int j) {
		adj[i].add(j);
		adj[j].add(i);
	}
	
	public void display(){
	        for(int i=0; i<adj.length; i++){
	            System.out.print(i);
	        for(int j=0; j<adj[i].size(); j++) {
	        	System.out.print("-> "+adj[i].get(j));
	        }
	        System.out.println(" ");
	      }
	    }
	public static void main(String[] args) {
		GraphAdjList g=new GraphAdjList();
        g.initializeList(5);
        g.addEdge(0,1);
        g.addEdge(0,4);
        g.addEdge(1,2);
        g.addEdge(2,3);
        g.addEdge(3,4);
        g.display();
	}
}
