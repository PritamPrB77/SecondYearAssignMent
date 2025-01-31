package cswBITWISE;



public class ReverseBIT {
    public static String Reverse(int x) {
        int res=0;
        while(x!=0) {
            res<<=1;
            int append=x&1;
            res|=append;
            x>>>=1;


        }
        return DEctoBin(res);
        //return Integer.toBinaryString(res);
    }
    public static String REverse(int x) {
        int res=0;
        for(int i=0;i<32;i++) {
            res=res<<1;
            res=res|(x&1);
            x=x>>>1;
        }
        //return res;
        //return DEctoBin(res);
        return Integer.toBinaryString(res);
    }
    public static String reverseBits(int n)
    {
        int rev = 0;

        // traversing bits of 'n'
        // from the right
        while (n > 0) {
            // bitwise left shift
            // 'rev' by 1
            rev <<= 1;

            // if current bit is '1'
            if ((int)(n & 1) == 1)
                rev ^= 1;

            // bitwise right shift
            //'n' by 1
            n >>= 1;
        }
        // required number
        return Integer.toBinaryString(rev);
    }

    public static String DEctoBin(int  n) {

        if(n==0) return "";
        return  DEctoBin(n/2)+n%2;
    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        int x=0b111;
        System.out.println(Reverse(x).equals("111"));
        System.out.println(REverse(x));
        System.out.println(reverseBits(x));
        System.out.println(Integer.toBinaryString(x).length());
        //String a=REverse(x);
        //System.out.println(Integer.getInteger(a));

    }

}
