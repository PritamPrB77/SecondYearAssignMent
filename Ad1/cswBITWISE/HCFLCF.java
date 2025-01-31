package cswBITWISE;

public class HCFLCF {
    public  static  int HCF(int x,int y){
        if(y==0)return x;
        return  HCF(y,x%y);
    }

    public static  int LCF(int x,int y){
        return  x*y/HCF(x,y);//
    }

    public static void main(String[] args) {
        System.out.println(HCF(9, 18));
        System.out.println(LCF(5, 7));

        char c = 'c';
        int a = (int) (c);
        char ch = (char)(55 + 10);
    }

}
