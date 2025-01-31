package leetCode;

public class AtoiProblem {
    //sorted Arry to remove duplicacy
//    public static  int removeDuplicacy(int arr[]){
//        ArrayList<Integer> s1=new ArrayList<>();
//
//
//
//        for(int i=0;i<arr.length-1;i++){
//            if(arr[i]!=arr[i+1]) s1.add(arr[i]);
//        }
//        s1.add(arr[arr.length-1]);
//        System.out.print(s1);
//        System.out.println();
//         return s1.size();
//    }


    public  static  int atoi( String str){
        int len=str.length();

         if(len ==0) return 0;
         int index=0;
         while(str.charAt(index)==' '){
             ++index;
         }
         boolean isNegetive=false;
         if(index<len){
          if(str.charAt(index)=='-'){
              isNegetive=true;
              ++index;
          } else if (str.charAt(index)=='+') {
              isNegetive=false; ++index;
          }
         }
       // System.out.println("k");
         int result=0;

         while(index<len ){
             if(isDigit(str.charAt(index))){
                 int digit= str.charAt(index)-'0';
                 System.out.println(digit);
                 if(result>(Integer.MAX_VALUE/10) ||(result ==(Integer.MAX_VALUE/10)&& digit>7)){
                     result= isNegetive?Integer.MIN_VALUE:Integer.MIN_VALUE;
                 }
                 result=(result*10)+digit;
                 ++index;
             }
             else{
                 ++index;
             }
         }

         return isNegetive?(-result):result;
    }
    public static  boolean isDigit(char ch){
        if(ch>'0'&&ch<'9') return true;
        else{
            return false;
        }
    }
    public static void main(String[] args) {
  //int arr[]={1,1,2,2,3,3,4,5,6,6,6,7,8};
        int arr[]={1,1};
// for(int i: removeDuplicacy(arr)){
//     System.out.print(i);
// }
//        System.out.println();
//        System.out.println(removeDuplicacy(arr));
//        for (int i = 0; i < 5; i++) {
//            System.out.println(i);
//            i+=2;
//        }


        String str= "a"+567756767;
        System.out.println("hello");
        System.out.println( atoi(str));

    }
}


