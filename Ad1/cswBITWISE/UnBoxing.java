package cswBITWISE;

import java.util.InputMismatchException;
import java.util.Scanner;

public class UnBoxing {



    public  static  String CheckBool(String s){

        if(s.equals(true)) return "true";
      else  if(s.equals(false)) return "false";
      else return "Invalid Input";

    }
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        try{
            System.out.println("Enter Float Number");
            Float s1=Float.valueOf(sc.nextLine());
            String s2=s1.toString();
            System.out.println(s2);
            float a=Float.parseFloat(s2);
            System.out.println(a);

        }
        catch(NumberFormatException e){//InputMismatchException
            System.out.println(e);
        }

        System.out.println("Enter Float Number");
        String s0=sc.nextLine();
        try{

            Float s1=Float.valueOf(s0);
            System.out.println(s1);
        }
        catch(NumberFormatException e){//InputMismatchException
            System.out.println(e);
        }



    }
}
