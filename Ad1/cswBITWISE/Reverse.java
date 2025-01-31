package cswBITWISE;

public class Reverse
{


    public static int reverse(int x){

        int a=x;int ans=0;
        if (x<0){
          a=-a;
        }
        while(a>0){
            ans=(ans*10)+a%10;
            a/=10;
        }
        if(x<0){
            return -ans;        }
        return  ans;
    }
    public static int reverseBits(int n)
    {
        int rev = 0;
        int num=n;
        if(n<0){
           n=-n;
        }

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
        if(num<0){
            return -rev;
        }
        return rev;
    }


      public static int createNUm(int x,int y){
        int num=0;
         y=reverse(y);int cnt=0;
         num=x%100;int temp=0;
         while(y!=0){
             if(cnt==2) break;
             temp=temp*10+(y%10);
             cnt++;
             y/=10;

         }
         return temp*100+num;
      }
      public  static  String Reverse(int x){
        int res=0;
        while(x!=0){
            res=res<<1;
            res=res|(x&1);
            x=x>>>1;
        }
        return Integer.toBinaryString(res);
      }
    public static void main(String[] args) {
        System.out.println(reverseBits(0b100100));
        System.out.println(reverse(-245));
        System.out.println(createNUm(3129,45678));
        System.out.println(Reverse(0b1101));
    }

}
