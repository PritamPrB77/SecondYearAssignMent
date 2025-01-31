package cswBITWISE;

public class frequencyCheck{

    public static void count(int num){
        int []freq = new int [10];
        int d=0;
        while (num !=0){
            d=num%10;
            freq[d]++;
           // freq[d]=(freq[d])+1;
            num=num/10;

        }
        for(int i=0 ; i<10;i++){
            if(freq[i]>0){
                System.out.println(i+";"+freq[i]);
            }
        }
    }

    public static void main(String[] args) {

        count(11201);
    }
}


