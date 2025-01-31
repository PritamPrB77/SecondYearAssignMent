package Practse;

import java.util.Scanner;

public class RecurseDectoHex {
    public static String DecToHex(int n ,String result){
        if(n==0) return result;
        if(n%16<10&&n%16>=0){
            return DecToHex(n/16,n%16+result);
        }
        if(n%16>=10&&n%16<16){
            char ch=(char)(55+n%16);
            return DecToHex(n/16,ch+result);
        }
        return "";
    }
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("result is "+ DecToHex(sc.nextInt(),""));
    }
}
