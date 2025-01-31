package cswBITWISE;

import java.util.Scanner;

public class wrpprandboxing {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter An Integer Stringf");
        int val= 123;
//convert int to integer using constructor
       // Integer obj1=new Integer(val);///depricated
// we can see a line here but no problem
//convert int to integer using autoboxing
        Integer obj2=val;
//convert int to integer using valueOf method
        Integer obj3= Integer.valueOf(val);
      //  System.out.println("obj 1 "+obj1);
        System.out.println("obj 2 "+obj2);
        System.out.println("obj 3 "+obj3);


//Convert int to Integer in form of String
       // Integer obj4= new Integer("1234");
//using value of method
        Integer obj5= Integer.valueOf("1234");
        Integer obj9= Integer.valueOf(12+12);
      //  System.out.println("obj 4 "+obj4);
        System.out.println("obj 5 "+obj5);
//unboxing process
     //   int a =obj1.intValue();
        int b =obj2.intValue();
     //   String s1= obj4.toString();
        String s2= obj5.toString();
        System.out.println("After Unboxing");
      //  System.out.println(s1+1);
        System.out.println("b: "+b);
     //   System.out.println("s1: "+s1);
        System.out.println("s2: "+obj9);

        String str=sc.nextLine();
        try {
            //Integer obj=Integer.valueOf(str);
            //	System.out.println("converted Integer To String"+obj);
            double value= Double.parseDouble("1234522 ");
            System.out.println("converted Integer To String"+value);
        }
        catch(NumberFormatException e) {
            System.out.println("Invalid Integer String"+" "+e);
        }
    }
}
