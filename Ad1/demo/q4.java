package demo;

public class q4{

    public static boolean LInearsearchRecursive(int arr[],int id,int x){
        if(id<=arr.length-1){
            if(arr[id]==x) return true;

        }
        if(id>=arr.length)return false;
        return  LInearsearchRecursive(arr,id+1,x);
    }

    public static boolean LInearsearchRecursive2(int arr[],int n,int x){
       if(n>=0){
           if(arr[n]==x) return true;
       }
        if(n<0) return false;
        return  LInearsearchRecursive(arr,--n,x);
    }
    public static void insertionsort(int arr[],int n){

        if(n==arr.length){
            return;
        }
        int min_idx=n;
        while(min_idx> 0&& arr[min_idx]<arr[min_idx-1]){
            int temp=arr[min_idx];
            arr[min_idx]=arr[min_idx-1];
            arr[min_idx-1]=temp;

            min_idx--;
        }
         insertionsort(arr,n+1);
    }


    public static void main(String[] args) {
        int arr[]={9,8,7,6,5,4};
      //  System.out.println(LInearsearchRecursive2(arr,3,7));
       insertionsort(arr,1);
       for(int i:arr){
           System.out.print(i+" ");
       }
    }
}
