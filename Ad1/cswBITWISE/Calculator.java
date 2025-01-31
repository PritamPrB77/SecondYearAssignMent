package cswBITWISE;



public class Calculator {
     public static void CAlCUlate(String x) throws  Exception{

             System.out.println(x);
             String ls = "";
             String rs = "";
             char ch = '+';
             for (int i = 0; i < x.length(); i++) {
                 if (x.charAt(i) == '*' || x.charAt(i) == '-' || x.charAt(i) == '+' || x.charAt(i) == '/') {
                     ls = x.substring(0, i);
                     System.out.println(ls);
                     ch = x.charAt(i);
                     rs = x.substring(i + 1, x.length());
                     break;
                 }
             }
             switch (ch) {
                 case '+':
                     System.out.println(Integer.parseInt(ls) + Integer.parseInt(rs));
                     break;
                 case '*':
                     System.out.println(Integer.parseInt(ls) * Integer.parseInt(rs));
                     break;
                 case '-':
                     System.out.println(Integer.parseInt(ls) - Integer.parseInt(rs));
                     break;
                 case '/':
                     System.out.println(Integer.parseInt(ls) / Integer.parseInt(rs));
                     break;
                 default:
                     System.out.println("invalid input");
             }

    }

    public static boolean CHeckFloatDiff( float x,float y){
        if(x-y <1.0f||y-x<1.0f){
           return true;
        }
        return false;
    }
    public static void main(String[] args) {


        try{
            CAlCUlate("1+55");
        }
        catch (Exception e){
            System.out.println("Invalid Argymengt");
        }
        System.out.println(CHeckFloatDiff(2.0f,5.0f));
    }
}
