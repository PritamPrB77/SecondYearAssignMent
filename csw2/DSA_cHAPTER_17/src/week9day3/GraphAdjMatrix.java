package week9day3;



import java.util.Arrays;



public class GraphAdjMatrix {
	int [][] adjMatrix;
	public void initializeMatrix(int v) {
		adjMatrix=new int[v][v];
		for(int [] row:adjMatrix) {
			Arrays.fill(row, 0);
		}
	}
	public void addEdge(int i,int j) {
		adjMatrix[i][j]=1;
		adjMatrix[j][i]=1;
	}
    public void printMatrix(int v){
        for(int i=0; i<v; i++){
            for(int j=0; j<v; j++)
            System.out.print(adjMatrix[i][j]+" ");
            System.out.println();
        }
       
    }
	public static void main(String[] args) {
		GraphAdjMatrix g=new GraphAdjMatrix();
        g.initializeMatrix(5);
        g.addEdge(0,1);
        g.addEdge(0,4);
        g.addEdge(1,2);
        g.addEdge(2,3);
        g.addEdge(3,4);
        g.printMatrix(5);
	}
}

