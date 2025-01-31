package cswBITWISE;

public class weightcalendsem2024ques {

    public static int weightcalculate(int x){
       // int a=Integer.parseInt(0+"x");
        int a=x;
        int count=0;
        while(((a>>count)&1)==((a>>count+1)&1)){
            count++;
            //a=x;
        }
        return (x^((1<<count)|(1<<count+1)));
    }
    public static int closest(int x){
        for(int i =0;i<5;i++){

            if(((x>>i)&1)!=((x>>(i+1))&1)){
                return x^((1<<i)|(1<<(i+1)));

            }
        }

        return -1;
    }

    public static void main(String[] args) {

        System.out.println(closest(0b111))  ;
        System.out.println(weightcalculate(0b111));
        int a=7;
        System.out.println(a>>2);
        System.out.println(a);
    }
}
