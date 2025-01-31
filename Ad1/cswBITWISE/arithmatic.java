package cswBITWISE;

import java.util.Scanner;

public class arithmatic {
}

    // Online Java Compiler
// Use this editor to write, compile and run your Java code online
//
//import java.util.*;
//import java.lang.*;
//import java.io.*;

    // The main method must be in a class named "Main".
    class Main {
        public static void Odd(int n){
            if((n&1)==1)
            {
                System.out.println("odd");
            }
            else if((n & 0)==0)
            {
                System.out.println("even");
            }
        }
        public static void multiplication(int x,int y){
            int res=1;
            int count=0;
            if(y<0){
                y=-y;
                x=1/x;
            }
            while(y!=0){
                ///  System.out.println("Hello world!");
                if((y&1)!=0){
                    res=res*x;
                    count++;
                }
                if(y>1){
                    x*=x;

                    count++;
                }
                y>>=1;
            }
            System.out.println("res is"+res +" total multiplication needed is"+count);
        }

        // public static void EVENCount(int n){
        //     int count=0;
        //     while(n!=0){
        //         if((n&1)==0 ){
        //         count++;
        //         }
        //         n>>=1;
        //     }
        //     System.out.println(count);
        // }

        public static void EVENCount(int n){
            int count=0;
            while(n!=0){
                if((n%10)%2==0){
                    count++;
                }
                n/=10;
            }
            System.out.println(count);
        }

        public static void freqCount(int n,int freq ){
            int count=0;
            while(n!=0){
                if((n%10)%freq==0){
                    count++;
                }
                n/=10;
            }
            System.out.println(count);
        }
        public static void main(String[] args) {
            System.out.println("Hello world!");
            Scanner sc=new Scanner(System.in);
            Odd(5);
            Odd(6);
            multiplication(2,6);
            EVENCount(5);
            freqCount(45,4);
        }
    }

