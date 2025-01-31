package cswBITWISE;

public class Division {
    public static  double cal(int x,int y){
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
        return res;
    }

    public static void  Division(int x,int y){
        int q = 0,k=55,y2k;
        y2k=y<<k;
        while(x>y){
            while (y2k>x){
                y2k=y2k>>1;
                k=k-1;
            }
            q=q+(1<<k);
            x=x-y2k;
        }
        System.out.println("quotient:-"+q);
        System.out.println("Remainder"+x);
    }

    public static void main(String[] args) {
        Division((int)cal(5,15),23);
    }

}
