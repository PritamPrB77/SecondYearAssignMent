package cswBITWISE;

public class Add {
    public static int Add(int x,int y) {
        int cy=0;
        while(y!=0) {
            cy=x&y;
            x=x^y;
            y=cy<<1;
        }
        return x;
    }

    public static void main(String[] args) {
        System.out.println( Add(3,5));;
    }
}
