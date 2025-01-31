package cswBITWISE;

import java.util.Scanner;

public class print100thPrime {
    public static boolean primeCheck(int x){
        int count=0;
        for(int i=2;i<x;i++){
        if(x%i==0){
            count++;
        }
        }
        if(count==0){
             return true;
        }
        return false;

    }
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        int primcnt=0,cnt=0;
        System.out.println("enter the number from which you count 100th prime numbert");
        int i=sc.nextInt();
        System.out.println(primeCheck(13));
        while(primcnt!=100){
            if(primeCheck(i)==true){
                System.out.print( i+"prime");
                primcnt++;cnt++;
            }
            if(cnt==10){
                System.out.println();
                cnt=0;
            }
           if(primcnt==100) break;
                i++;
        }
        System.out.println(primcnt);
    }
}
