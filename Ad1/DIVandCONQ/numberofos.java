package DIVandCONQ;

public class numberofos {


    public  static  int numberofzeros(String s){

        if(s.length()==1){
            if(s.charAt(0)=='0'){
              //  System.out.println(s.charAt(0));
               return 1;
            }
            else{
              //  System.out.println("k");
                return 0;
            }
        }
         int mid=(s.length())/2;
        return numberofzeros(s.substring(0,mid))+ numberofzeros(s.substring(mid));


    }
    public static void main(String[] args) {
    String s="110010000 ";
        System.out.println(s.substring(0,s.length()/2));
        System.out.println(s.charAt(2)=='0');
        System.out.println(s.substring(1,1));
       System.out.println(numberofzeros(s));
    }
}
