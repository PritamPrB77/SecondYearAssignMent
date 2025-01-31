package cswBITWISE;



import java.util.Scanner;

public class parityCheck {

    public static int SetCountBit(int x) {
        int count=0;
        while(x!=0) {
            x=x&(x-1);
            count=count+1;
        }
        return count;
    }
    public static int ParityChec(int x) {
        int ep=0;
      while(x!=0){
         ep=ep^1;
         x=x&(x-1);
      }
      return ep;
    }

    public static String SwapithAndjth(int i,int j,int x) {
        //System.out.println((((x>>j)&1)==((x>>i)&1))?x:(x=x^((1<<i)|(1<<j))));

        return DEctoBin((((x>>j)&1)==((x>>i)&1))?x:(x=x^((1<<i)|(1<<j))));

    }
    public static int SwapithAndjthh(int i,int j,int x) {
//        int a=(x>>i)&1;
//        int b=(x>>j)&1;
        if(((x>>i)&1)!=((x>>j)&1)) {
            x=x^(1<<i)|(1<<j);
        }
        return x;
    }
    public static String DEctoBin(int n) {

        if(n==0) return "";
        return  DEctoBin(n/2)+n%2;
    }

    public static int revDEc(int x,int op) {
        if(x==0) return op;
        op=(op*10)+x%10;

        return revDEc(x/10,op);
    }
    public static boolean palindromnum(int x) {
        if(x==revDEc(x,0))return true;
        else return false;
    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner sc=new Scanner(System.in);
        System.out.println(SetCountBit(0b0110111));
        if(SetCountBit(0b01101111)%2==1) {
            System.out.println(1);
        }
        else System.out.println(0);

        System.out.println( ParityChec(0b1111)+" gp");

       // System.out.println(ParityCheck(0b01101111));
        System.out.println(DEctoBin(6));

        System.out.println(SwapithAndjth(0,1,0b101)+"  ithjth");
        System.out.println(palindromnum(36));
        System.out.println(1>>0);

    }

}
