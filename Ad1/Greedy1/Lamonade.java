package Greedy1;

public class Lamonade {
    public  static boolean lemonadeChange(int[] bills) {
        int $5=0;int $10=0; boolean res=false;
        int $20=0; int i=0;
         while(i<bills.length){

             if(bills[i]==5) {
                 $5 += 1;
                 // System.out.println($5);
             }
             else if (bills[i]==10){
                 $10+=1;
                 if($5!=0){ $5-=1 ;res=true;}
                 else {return false;}
             }
             else if(bills[i]==20){
                 if(($10>=1 && $5>=1)||($5>=3)){
                     System.out.println($10);
                     System.out.println($5);
                     if($10>=1 && $5>=1){
                         $10-=1; $5-=1;
                     res=true;

                     }
                     else if($5>=3)
                     {
                         $5-=3;
                         res=true;
                     }


                     $20+=1;
                 }
                 else{
                     return false;
                 }
             }
               i++;
         }
         return res;
    }

    public static void main(String[] args) {
      int[] bills = {5,5,10,5,10,20,20,5,20,20};
        System.out.println(lemonadeChange(bills));
    }

}
