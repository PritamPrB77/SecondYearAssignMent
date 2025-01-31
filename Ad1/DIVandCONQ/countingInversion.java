package DIVandCONQ;

import java.util.Arrays;

public class  countingInversion {
    public static int mergeSort(int arr[],int l,int r){
        int cnt=0;
        if(l>=r)return 0;
        int mid=(l+r)/2;
        cnt+=mergeSort(arr,l,mid);
       cnt+= mergeSort(arr,mid+1,r);
      cnt+= merge(arr,l,mid,r);
      return cnt;
    }

    public static  int merge(int arr[],int l,int mid ,int r){
        int n1=mid-l+1;
        int n2=r-mid;
        int[]left=new int[n1];
        int []right=new int[n2];

        int i,j,k;
        for(i=0;i<n1;i++){
            left[i]=arr[l+i];
        }
        for(j=0;j<n2;j++){
            right[j]=arr[mid+1+j];
        }
        i=0;j=0;k=l;
        int cnt=0;
        while(i<n1&&j<n2){

            if(left[i]<right[j]){//<=
                arr[k++]=left[i++];
            }
            else{
               // System.out.println(i);
                System.out.println(arr[i]);
                cnt+=(n1-i);
                System.out.println(cnt);
                arr[k++]=right[j++];
            }
            System.out.println("....");
        }
        while(i<n1){
            arr[k++]=left[i++];
        }
        while (j<n2){
            arr[k++]=right[j++];
        }
        System.out.println(Arrays.toString(arr));
        return  cnt;
    }

    public static void main(String[] args) {
        int arr[]={3, 7, 10, 14, 18, 19, 2, 11, 16, 17, 23, 25};
        System.out.println(Arrays.toString(arr));
        System.out.println(mergeSort(arr,0,arr.length-1));
    }
}
