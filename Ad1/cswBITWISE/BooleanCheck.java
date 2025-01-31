package cswBITWISE;

import java.util.Scanner;

public class BooleanCheck {
    public  static  String CheckBool(String s){
        //kjjSystem.out.println(s);
        if(s.equals("true") )return "true";
        else  if(s.equals("false")) return "false";

        else {
           // System.out.println("sds");
            return "Invalid Input";
        }

    }

    public static  Boolean boolconv(String s){
        if (s.equals("true")) return true;
        else if(s.equals("false")) return  false;
        else return null;

    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
//        Boolean s1=Boolean.valueOf(sc.nextLine());
//        System.out.println(s1);
//        //System.out.println(p);


//        String  dd=sc.nextLine();
//        try{
//            Boolean s1=Boolean.valueOf(dd);
//            System.out.println(s1);
//        }
//        catch (NumberFormatException i)
//        {
//            System.out.println(i);
//        }
//

      String s=sc.nextLine();
      if(s.equals("true")||s.equals("false")){
          boolean s1=Boolean.parseBoolean(s);
          System.out.println(s1);
      }
      else{
          System.out.println("Invalid Input");
      }

      if(s.equals("true")||s.equals("false")){
          Boolean s1=Boolean.valueOf(s);
          System.out.println(s1);
      }
      else{
          System.out.println("Invalid argument");
      }



//
//       String s=CheckBool(sc.nextLine());boolean a1;
//       // System.out.println(s);
//       if(s.equals("true")){
//             a1=Boolean.parseBoolean(s);
//           System.out.println(a1);
//       }
//       else if(s.equals("false")){
//           a1=Boolean.parseBoolean(s);
//          // System.out.println(a1);
//       }
//       else{
//           System.out.println("Invalid Argument");
//
//       }
//
//
//
//     String tt=sc.nextLine();
//       Boolean t1;
//       if(boolconv(tt)){
//           t1=boolconv(tt);
//           System.out.println(t1);
//       }
//       else if(!boolconv(tt)){
//           t1=boolconv(tt);
//           System.out.println(t1);
//       }
//       else{
//           System.out.println("Invalid  Output");
//       }

//              if (boolconv(tt)!=null){
//                  t1=boolconv(tt);
//                  System.out.println(t1);
//              }
//            else{
//                  System.out.println("nUmber Format Exception");
//              }


//        try{
//            Boolean s1=Boolean.valueOf(sc.nextLine());
//            boolean s2=Boolean.parseBoolean(s1.toString());
//            System.out.println(s1);
//        }
//        catch (NumberFormatException e){
//            System.out.println(e);
//        }
    }
}
