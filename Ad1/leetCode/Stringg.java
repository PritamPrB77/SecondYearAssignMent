package leetCode;

class Solutionn {

    public static boolean  checkIsOdd(Long x){
        //System.out.println(x);
        if((x&1)==1) return true;
        else return false;
    }


    public static String largestOddNumber(String num) {
        //System.out.println(num);
        String s=""; int st=0;int end=num.length();
        Long maxNum=Long.MIN_VALUE;
       // System.out.println(maxNum);
        Long y=maxNum;
        if(num.length()==0) return "";
        System.out.println("Hello");
        while(st<=end-1){
            //System.out.println(num.substring(st,end));
           Long xxx=Long.parseLong(num.substring(st,end));
            System.out.println(xxx+"-");
            if(checkIsOdd(xxx)){
                System.out.println(xxx);
                maxNum= Math.max(maxNum,xxx);

            }else{
               end--;
                st-=1;
            }
            st++;

        }
        if(y==maxNum) return "";
        return ""+maxNum;


    }

    public static void main(String[] args) {
       String x= largestOddNumber("35427");
        System.out.println(x);
    }
}