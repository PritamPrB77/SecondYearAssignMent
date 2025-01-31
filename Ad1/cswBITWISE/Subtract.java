package cswBITWISE;

public class Subtract {
    public static  void Substract(int x,int y){
        int brw=0;
        while(y!=0){
            brw=(~x)&y;
            x=x^y;
            y=brw<<1;

        }        System.out.println("diff is "+x);
    }
    public static void main(String[] args) {
        Substract(4,7);
    }
}
