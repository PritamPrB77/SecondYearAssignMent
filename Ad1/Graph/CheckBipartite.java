package Graph;

import javax.swing.plaf.IconUIResource;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class CheckBipartite {
    int count;
 ArrayList<ArrayList<Integer>> grph;
    CheckBipartite(int cnt){
        this.count= cnt;
        grph=new ArrayList<ArrayList<Integer>>(count);
        for(int i=0;i<count;i++){
            grph.add(new ArrayList<Integer>());// it Adds Index wise to ArrayList And in Each Index It Create an ArrayList
        }
    }

    public   void AddEdge(int src,int dst){
        grph.get(src).add(dst);
        grph.get(dst).add(src);

    }

    public   void createGraph(){
        AddEdge(0,1);
        AddEdge(0,2);
        AddEdge(1,3);
        AddEdge(2,1);
        AddEdge(2,3);
    }

    public boolean Checkpartitte(CheckBipartite s1,int src){
        //System.out.print("fedfdfd");
        boolean vis[]=new boolean[s1.count];
        Queue<Integer> q=new LinkedList<>();
        String Color[]=new String[grph.size()];

        Arrays.fill(Color,"nill");
        q.add(src);
        Color[src]="red";

        while(!q.isEmpty()){
            int elem=q.remove();
           // System.out.println(elem);
           // System.out.println("hello");
            for (int i = 0; i < grph.get(elem).size(); i++) {
                if(Color[grph.get(elem).get(i)]=="nill"){
                    //System.out.println(grph.get(elem).get(i));
                    Color[grph.get(elem).get(i)]= (Color[elem]=="red")?"blue":"red";
                    q.add(grph.get(elem).get(i));
                }
                else if(Color[grph.get(elem).get(i)]==Color[elem]){
//                    System.out.println(Color[grph.get(elem).get(i)]+""+grph.get(elem).get(i));
//                    System.out.println(Color[elem]+grph.get(elem).get(i));
                    return false;
                }

            }

        }
        return true;

    }

    public  void Display(){
        for (int i = 0; i < count; i++) {
            ArrayList<Integer> graph=grph.get(i);
            System.out.print(i+"->");
            for(int j:graph){
                System.out.print(j+" ->");
            }
            System.out.println();
        }
       // System.out.println(grph.get(0).get(1));
    }

    public static void main(String[] args) {

        CheckBipartite s1=new CheckBipartite(4);
        s1.createGraph();
        s1.Display();
        System.out.println(s1.Checkpartitte(s1,0));

    }

}
