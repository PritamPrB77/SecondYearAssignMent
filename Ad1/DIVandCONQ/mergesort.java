package DIVandCONQ;

import java.util.Arrays;

public class mergesort {
    public static void mergeSort(int arr[],int l,int r){
        if(l>=r)return ;
        int mid=(l+r)/2;

        mergeSort(arr,l,mid);
        mergeSort(arr,mid+1,r);
        merge(arr,l,mid,r);
    }

    public static  void merge(int arr[],int l,int mid ,int r){
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
        System.out.println(Arrays.toString(left));

        System.out.println(Arrays.toString(right));
        System.out.println(".....");
        while(i<n1&&j<n2){
            if(left[i]<right[j]){
                System.out.println(left[i]);
                arr[k]=left[i];
                i=i+1; k=k+1;
            }
            else{
                arr[k]=right[j];
                k=k+1; j=j+1;
            }
        }
        //System.out.println(Arrays.toString(arr));

        while(i<n1){
            arr[k]=left[i];
            i=i+1; k=k+1;
        }
        while (j<n2){
            arr[k]=right[j];
            j=j+1; k=k+1;
        }


    }
    public static void main(String[] args) {
    int arr[]={5,3,2,1,4};
        System.out.println(Arrays.toString(arr));
    mergeSort(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));

    }
}
