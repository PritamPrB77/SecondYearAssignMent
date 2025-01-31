package cswBITWISE;

public class SumOfSeries {
    public  static  void SumOFSeroies(int n){
       /// int i=1;int sum=0;
       double sum=0;
//
//
//
//        while(i!=n){
//            sum+=1/i;
//            i++;
//        }

        for (double i=1;i<=n;i++){
            sum=sum+(1/i);
           // System.out.println(sum);
        }
        System.out.println(sum);
    }
    public static void main(String[] args) {

    SumOFSeroies(12);
    }
}
