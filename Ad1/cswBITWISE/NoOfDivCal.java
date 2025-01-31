package cswBITWISE;

public class NoOfDivCal {
    public static void cal(int x,int y){
        if(y<0){
            y=-y;
            x=1/x;
        }
        double res=1.0;
        while(y!=0){
            if((y&1)==1){
                res=res*x;
            }
            if(y>1){
                x*=x;
            }
            y>>=1;
        }
        System.out.println(res);
    }

    public static void main(String[] args) {
        System.out.println();
        cal(2,5);
    }
}
