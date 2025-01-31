package cswBITWISE.superdigit;

public class JAva {

    public static  int count(int num,int k,int cnt,int digit){
        System.out.println(digit);
        if(k==0)return 3;
        digit= (num*(10<<cnt))+num;
        cnt=0;
        while(num!=0){
            cnt++;
            num/=10;
        }
        System.out.println(cnt);
        return cnt*count(num,k-1,cnt,digit);

    }
    public static void main(String[] args) {
       // System.out.println(10<<3);
      //  System.out.println(count(123,3,0,0));
    }
}
